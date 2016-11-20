package practice.innerclasses;

import java.util.Random;

/**
 * Created by Liam on 20/11/2016.
 */
interface U {
    String a();
    String b();
    String c();
}

class A2 {
    U make() {
        return new U() {
            @Override
            public String a() {
                return "A2.a() ";
            }

            @Override
            public String b() {
                return "A2.b()";
            }

            @Override
            public String c() {
                return "A2.c()";
            }
        };
    }
}

class B1 {
    private U[] us;
    private int next = 0;

    B1(int size) {
        us = new U[size];
    }

    // method 1
    void store(U u) {
        if(next < us.length)
            us[next++] = u;
    }

    // method 2
    void setNull() {
        if(next > 0)
            us[--next] = null;
    }

    // method 3
    void invoke() {
        for(int i = 0; i < next; i++) {
            System.out.println(us[i].a() + ": " + (i + 1));
            System.out.println(us[i].b() + ": " + (i + 1));
            System.out.println(us[i].c() + ": " + (i + 1));
        }
    }
}
public class Practice23 {
    public static void main(String[] args) {
        Random rand = new Random(11);
        int limit = rand.nextInt(10);

        B1 b1 = new B1(10);

        for(int i = 0; i < 10; i++)
            b1.store(new A2().make());

        b1.invoke();

        for(int i = 0; i < limit; i++) {
            b1.setNull();
        }

        b1.invoke();
    }
}
