package typeinfo;

import java.util.List;
import java.util.Collections;

import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

/**
 * Created by Liam on 08/02/2017.
 */
class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    private class NRobot implements Null, Robot {
        @Override
        public String name() { return nullName; }

        @Override
        public String model() { return nullName; }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxied, Method method, Object[] args)
            throws Throwable {
        return method.invoke(proxied, args);
    }
}


public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type) {
        return (Robot)Proxy.newProxyInstance(NullRobot.class.getClassLoader(),
                new Class[] { Null.class, Robot.class },
                new NullRobotProxyHandler(type));
    }

    public static void main(String[] args) {
        Robot[] bots = {
            new SnowRemovalRobot("SnowBee"),
            newNullRobot(SnowRemovalRobot.class)
        };

        for(Robot bot : bots)
            Robot.Test.test(bot);
    }
}
