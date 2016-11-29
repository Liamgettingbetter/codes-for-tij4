package holding;

import com.apple.concurrent.Dispatch;

import java.util.*;

/**
 * Created by Liam on 28/11/2016.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue =
                new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            pQueue.offer(rand.nextInt(i + 10));
        QueueDemo.printQ(pQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14,
                9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        pQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(pQueue);

        pQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        pQueue.addAll(ints);
        QueueDemo.printQ(pQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ =
                new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ);

        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for(char c : fact.toCharArray())
            charSet.add(c); // Autoboxing
        PriorityQueue<Character> characterPQ =
                new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);
    }
}
