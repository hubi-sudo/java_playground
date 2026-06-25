package Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(4);
        queue.offer(5);
        queue.offer(1);

        System.out.println(queue);

    }
}
