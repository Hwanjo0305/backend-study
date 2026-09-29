package day12;
import java.util.Scanner;

public class BaekJoon1 {
    public static void main(String[] args) {
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int multiple = a*b*c;
        
        while(multiple > 0) {
            int digit = multiple % 10;
            count[digit]++;
            multiple = multiple / 10;
        }
        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
        scanner.close();
    }
}
