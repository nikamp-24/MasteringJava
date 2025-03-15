package Java;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionFramework_03 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

//        adds the elements in the queue if the task is successful returns true or false if not
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);

        System.out.println(queue);

//        returns and removes  the first element of the queue returns null if queue is empty
        System.out.println(queue.poll());

        System.out.println(queue);

//        return the head of the element returns null if queue is empty
        System.out.println(queue.peek());

// add is used for offer ,remove is used for poll similarly element is used for peek but using them throws an exception if the queue is empty


//        it will work for min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        adds the elements in the queue if the task is successful returns true or false if not
        pq.offer(40);
        pq.offer(12);
        pq.offer(13);
        pq.offer(14);

//        prints the queue according to its priority
        System.out.println(pq);

//        returns and removes  the first element or smallest of the queue returns null if queue is empty
        System.out.println(pq.poll());

        System.out.println(pq);

//        return the head of the element returns null if queue is empty
        System.out.println(pq.peek());


//       now it will work for max heap and returns the elements in the decreasing order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

    }
}
