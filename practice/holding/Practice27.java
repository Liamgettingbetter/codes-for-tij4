package practice.holding;

import java.util.Queue;

/**
 * Created by Liam on 28/11/2016.
 */
public class Practice27 {
    private class Command {
        private String id;

        void operation() {
            System.out.println(id);
        }
    }

    private class Tools {
        private Queue<Command> queue;

        private Command inflate(Command obj) {
            queue.offer(obj);
            return obj;
        }
    }

    private class Consume {
        void invoke(Queue<Command> q) {
            for(Command c : q) {

            }
        }
    }
}
