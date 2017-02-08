package typeinfo;

import java.util.List;

/**
 * Created by Liam on 07/02/2017.
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    // Nested class to perform test case
    class Test {
        public static void test(Robot r) {
            if(r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Robot name : " + r.name());
            System.out.println("Robot model : " + r.model());

            for(Operation op : r.operations()) {
                System.out.println(op.description());
                op.command();
            }
        }
    }
}
