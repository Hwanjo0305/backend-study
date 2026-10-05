package week3.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 대기 중...");
        Socket socket = serverSocket.accept();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
        String message = reader.readLine();

        System.out.println("받은 메시지: " + message);

        socket.close();
        serverSocket.close();
    }    
}
