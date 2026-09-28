package day10;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            int number = 10;
            int result = number/0;   
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 계속 실행됩니다.");

        try {
            AgeValidator.validate(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 나이입니다.");
        }
    }
}
