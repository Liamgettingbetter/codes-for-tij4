package practice.holding;

import java.util.*;

/**
 * Created by Liam on 24/11/2016.
 */
class StringGenerator {
    private enum movies {
        INCEPTION, RIO, GAME_OF_THRONE,
        INDEPENDENCE_DAY, THE_BLADE, THE_LOOPER
    }

    static String next() {
        Random rand = new Random();
        switch(rand.nextInt(6)) {
            case 0 : return "INCEPTION";
            case 1 : return "RIO";
            case 2 : return "GAME_OF_THRONE";
            case 3 : return "INDEPENDENCE_DAY";
            case 4 : return "THE_BLADE";
            case 5 : return "THE_LOOPER";
            default: return null;
        }
    }
}

public class Practice4 {
    public static void main(String[] args) {
        String[] container = new String[10];
        for(int i = 0; i < container.length; i++)
            container[i] = StringGenerator.next();


        List<String> list1 = Arrays.asList(container);


        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(container));

        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(container));

        Set<String> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(container));

        Set<String> set3 = new LinkedHashSet<>();
        set3.addAll(Arrays.asList(container));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
