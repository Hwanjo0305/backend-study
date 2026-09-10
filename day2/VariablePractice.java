package day2;
import java.util.Scanner;

public class VariablePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();
        System.out.println("안녕하세요, " + name + "님! 당신의 나이는 " + age + "살입니다.");
        scanner.close();
    }
}
