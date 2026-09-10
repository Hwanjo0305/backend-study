package day2;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        if(score >= 0 && score <= 100) {
            if(score >= 90) {
                System.out.println("A학점입니다.");
            } else if(score >= 80) {
                System.out.println("B학점입니다.");
            } else if(score >= 70) {
                System.out.println("C학점입니다.");
            } else if(score >= 60) {
                System.out.println("D학점입니다.");
            } else {
                System.out.println("F학점입니다.");
            }
        } else {
            System.out.println("잘못된 점수입니다. 0~100 사이의 점수를 입력하세요.");
        }
        scanner.close();
    }
}
