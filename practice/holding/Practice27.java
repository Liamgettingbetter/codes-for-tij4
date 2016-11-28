package practice.holding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Liam on 28/11/2016.
 */
public class Practice27 {
    private class Command {
        private String id;

        Command(String id) {
            this.id = id;
        }

        void operation() {
            System.out.println(id);
        }
    }

    private class Tools {
        private Queue<Command> queue = new LinkedList<>();


        private Command inflate(Command obj) {
            queue.offer(obj);
            return obj;
        }
    }

    private class Consume {
        void invoke(Queue<Command> q) {
            while(!q.isEmpty())
                q.poll().operation();
        }
    }

    public static void main(String[] args) {
        Practice27 p27 = new Practice27();
        Tools t = p27.new Tools();
        Consume c = p27.new Consume();

        for(int i = 0; i < 10; i++)
            t.inflate(p27.new Command("Liam " + (i + 1)));
        c.invoke(t.queue);

    }
}
