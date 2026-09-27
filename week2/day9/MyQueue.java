package day9;
import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> data = new ArrayList<>();

    public void offer(int value) {
        data.add(value);
    }

    public int poll() {
        return data.remove(0);
    }

    public int peek() {
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.isEmpty());
    }
}
