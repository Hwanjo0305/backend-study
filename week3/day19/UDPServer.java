package week3.day19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(8081);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("UDP 서버 대기 중...");

        socket.receive(packet);
        String message =
                new String(packet.getData(), 0, packet.getLength());
        System.out.println("받은 메시지: " + message);

        socket.close();
    }
}
