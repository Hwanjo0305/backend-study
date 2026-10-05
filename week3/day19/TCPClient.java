package week3.day19;

import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8080);
        
        PrintWriter writer =
                new PrintWriter(socket.getOutputStream(), true);

        writer.println("Hello Server!");
        socket.close();
    }
}
