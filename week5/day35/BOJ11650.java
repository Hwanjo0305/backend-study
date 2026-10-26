import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BOJ11650 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];

        // 1. 좌표 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2. 좌표 정렬 (직접 구현)
        Arrays.sort(points, (a, b) -> {
            if(a[0] != b[0]) {
                return Integer.compare(a[0],b[0]);
            } else {
                return Integer.compare(a[1],b[1]);
            }
            // x좌표 우선 비교
            // x좌표가 같으면 y좌표 비교
        });

        // 3. 출력 문자열 생성
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(points[i][0])
              .append(" ")
              .append(points[i][1])
              .append("\n");
        }

        System.out.print(sb);
    }
}