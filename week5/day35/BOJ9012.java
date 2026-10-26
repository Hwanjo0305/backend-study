import java.util.Scanner;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            String str = scanner.next();
            int count = 0;
            for(int j = 0; j < str.length(); j++) {

                if(str.charAt(j)=='(') {
                    count++;
                } else if(str.charAt(j)==')') {
                    count--;
                }
                if(count < 0) {
                    break;
                }
            }
            if(count!=0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
