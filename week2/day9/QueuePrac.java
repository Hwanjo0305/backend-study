package day9;
import java.util.Deque;
import java.util.ArrayDeque;

public class QueuePrac {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
