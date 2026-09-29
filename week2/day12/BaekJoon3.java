package day12;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Boolean> num1 = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            num1.put(input, true);
        }
        int m = scanner.nextInt();
        for(int j = 0; j < m; j++) {
            int input2 = scanner.nextInt();
            if(num1.containsKey(input2)) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            System.out.print(" ");
        }

        scanner.close();
    }
}
