package week3.day19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello UDP!";
        byte[] data = message.getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet =
                new DatagramPacket(
                    data,
                    data.length,
                    address,
                    8081);

        socket.send(packet);
        socket.close();
    }
}
