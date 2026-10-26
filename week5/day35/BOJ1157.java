import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next().toUpperCase();

        int[] counts = new int[26];
        char result = '?';
        int max = 0;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'A';
            counts[index]++;
            if(counts[index] > max) {
                max = counts[index];
                result = word.charAt(i);
            }
        }
        int max_count = 0;
        for(int j = 0; j < counts.length; j++) {
            if(counts[j]==max) {
                max_count++;
            }
        }
        if(max_count!=1) {
            result = '?';
        }
        System.out.println(result);
        scanner.close();
    }
}
