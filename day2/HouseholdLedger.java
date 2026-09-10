package day2;
import java.util.Scanner;

public class HouseholdLedger {
    public static void main(String[] args) {
        int input = 0;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while(input != 4) {
            System.out.println("1. 수입 입력");
            System.out.println("2. 지출 입력");
            System.out.println("3. 현재 잔액");
            System.out.println("4. 종료");
            input = scanner.nextInt();
            switch(input) {
                case 1:
                    System.out.print("수입 금액을 입력하세요: ");
                    int income = scanner.nextInt();
                    balance += income;
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 2:
                    System.out.print("지출 금액을 입력하세요: ");
                    int expense = scanner.nextInt();
                    balance -= expense;
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        scanner.close();
    }
}
