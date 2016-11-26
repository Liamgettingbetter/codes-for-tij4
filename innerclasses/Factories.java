package innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface Services {
    void method1();
    void method2();
}

interface ServiceFactories {
    Services getService();
}

class Implementation1 implements Services {
    private Implementation1() {}

    @Override
    public void method1() {
        System.out.println("Implementation1.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1.method2()");
    }

    // Singleton occurs here
    public static ServiceFactories f =
            new ServiceFactories() {
                @Override
                public Services getService() {
                    return new Implementation1();
                }
            };
}

class Implementation2 implements Services {
    private Implementation2() {}

    @Override
    public void method1() {
        System.out.println("Implementation2.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2.method2()");
    }

    // Singleton occurs here !
    public static ServiceFactories f =
            new ServiceFactories() {
                @Override
                public Services getService() {
                    return new Implementation2();
                }
            };
}

public class Factories {
    public static void serviceConsumer(ServiceFactories f) {
        Services s = f.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.f);
        serviceConsumer(Implementation2.f);
    }
}
