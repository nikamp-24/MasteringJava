package Java;

import java.util.ArrayDeque;

public class CollectionFramework_04 {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(3);
        adq.offerFirst(12);
        adq.offerLast(15);
        adq.add(40);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll: "+adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);



    }
}
