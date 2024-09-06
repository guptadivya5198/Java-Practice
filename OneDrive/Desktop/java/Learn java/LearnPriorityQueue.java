// import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String a[])
    {
        // Queue<Integer> pq = new PriorityQueue<>();
        // pq.offer(40);
        // pq.offer(20);
        // pq.offer(60);
        // System.out.println(pq);

        // System.out.println(pq.poll());
        // System.out.println(pq);
        // System.out.println(pq.peek());

        ArrayDeque <Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(12);

        System.out.println(adq);

        adq.peekFirst();
        System.out.println(adq);

        adq.pollFirst();
        System.out.println(adq);

    }
}
