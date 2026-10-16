import java.util.Scanner;

public class BOJ10871 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for(int j = 0; j < n; j++) {
            if(array[j] < m) {
                System.out.print(array[j]+" ");
            }
        }
        scanner.close();
    }   
}
