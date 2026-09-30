package day13;
import java.util.Scanner;

public class MemberMain {
    public static void main(String args[]) {
        MemberManager manager = new MemberManager();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(n!=5) {
            System.out.println("===== 회원 관리 프로그램 =====");
            System.out.println("1. 회원가입");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 검색");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            n = scanner.nextInt();
            switch (n) {
                case 1 :
                    System.out.print("ID를 입력하세요: ");
                    long id = scanner.nextLong();
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.next();
                    System.out.print("이메일을 입력하세요: ");
                    String email = scanner.next();
                    User user = new User(id,name,email);
                    manager.addUser(user);
                    break;
                case 2 :
                    manager.findAll();
                    break;
                case 3 :
                    System.out.println("검색할 ID를 입력하세요: ");
                    long findId = scanner.nextLong();
                    manager.findUser(findId);
                    break;
                case 4 :
                    System.out.println("삭제할 ID를 입력하세요: ");
                    long delID = scanner.nextLong();
                    manager.deleteUser(delID);
                    break;
            }
        }
        scanner.close();
    }
}
