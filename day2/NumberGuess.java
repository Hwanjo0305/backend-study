package day2;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int count = 0;
        while(guess != answer) {
            System.out.print("숫자를 입력하세요: ");
            guess = scanner.nextInt();
            count++;
            if(guess < answer) {
                System.out.println("더 큰 숫자입니다.");
            } else if(guess > answer) {
                System.out.println("더 작은 숫자입니다.");
            } else {
                System.out.println("정답입니다!");
                System.out.println("총 " + count + "번 시도했습니다.");
            }
        }
        scanner.close();
    }
}