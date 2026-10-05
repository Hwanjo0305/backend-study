package week3.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 대기 중...");

        Socket socket = serverSocket.accept();

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

        // Request Line 읽기
        String message = reader.readLine();

        System.out.println("받은 메시지: " + message);

        // Header 읽기
        String line;
        int contentLength = 0;

        while (!(line = reader.readLine()).isEmpty()) {
            System.out.println("Header: " + line);

            if (line.startsWith("Content-Length:")) {
                contentLength = Integer.parseInt(
                        line.substring("Content-Length:".length()).trim()
                );
            }
        }

        // Body 읽기
        String body = "";

        if (contentLength > 0) {

            char[] bodyChars = new char[contentLength];

            int read = 0;

            while (read < contentLength) {
                int count = reader.read(
                        bodyChars,
                        read,
                        contentLength - read
                );

                if (count == -1) {
                    break;
                }

                read += count;
            }

            body = new String(bodyChars, 0, read);

            System.out.println("Body: " + body);

            // JSON 파싱
            if (body.startsWith("{") && body.endsWith("}")) {

                // { } 제거
                String content = body.substring(1, body.length() - 1);

                // , 기준으로 분리
                String[] fields = content.split(",");

                if (fields.length >= 2) {

                    // : 기준으로 분리
                    String name = fields[0].split(":", 2)[1];
                    String email = fields[1].split(":", 2)[1];

                    System.out.println("이름: " + name);
                    System.out.println("이메일: " + email);
                }
            }

        } else {
            System.out.println("Body: 없음");
        }

        // Response
        PrintWriter writer =
                new PrintWriter(socket.getOutputStream(), true);

        if (message.contains("GET /hello")) {

            writer.println("HTTP/1.1 200 OK");
            writer.println("Content-Type: text/plain; charset=UTF-8");
            writer.println("Set-Cookie: username=YunHwan");
            writer.println();
            writer.println("Hello, YunHwan!");

        } else {

            writer.println("HTTP/1.1 404 Not Found");
            writer.println("Content-Type: text/plain; charset=UTF-8");
            writer.println();
            writer.println("Not Found");
        }

        socket.close();
        serverSocket.close();
    }
}