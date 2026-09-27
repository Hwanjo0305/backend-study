package day9;
import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> data = new ArrayList<>();

    public void push(int value) {
        data.add(value);
    }
    public int pop() {
        return data.remove(data.size()-1);
    }
    public int peek() {
        return data.get(data.size()-1);
    }
    public boolean isEmpty() {
        return data.size() == 0;
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
    }
}
