package day12;
import java.util.Scanner;

public class Baekjoon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        String number = scanner.next();
        for(int i = 0; i < n; i++) {
            //System.out.println(number.charAt(i));
            sum += number.charAt(i)-'0';
        }
        System.out.println(sum);

        scanner.close();;
    }
}
