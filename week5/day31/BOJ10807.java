import java.util.Scanner;

public class BOJ10807 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int count = 0;
        for(int j = 0; j < n; j++) {
            if(target == array[j]) {
                count++;
            }
        }
        System.out.println(count);
        
        scanner.close();
    }
}
