package practice.holding;

import holding.QueueDemo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Liam on 29/11/2016.
 */
public class Practice28 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        PriorityQueue<Double> queue = new PriorityQueue<>();

        for(int i = 0; i < 10; i++)
            queue.offer(rand.nextDouble());

        while(queue.peek() != null)
            System.out.print(queue.poll() + " ");
    }
}
