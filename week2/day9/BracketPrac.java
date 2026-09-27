package day9;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BracketPrac {
    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean valid = true;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c=='(') {
                stack.push('(');
            } else if(c==')') {
                if(stack.isEmpty()) {
                    valid = false;
                    break;
                }
                stack.pop();
            }
        }
        System.out.println(valid&&stack.isEmpty());
        scanner.close();
    }
}
