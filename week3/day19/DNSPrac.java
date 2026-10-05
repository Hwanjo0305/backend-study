package week3.day19;

import java.net.InetAddress;

public class DNSPrac {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.naver.com");
        System.out.println("호스트 이름: " + address.getHostName());
        System.out.println("IP 주소: " + address.getHostAddress());
    }
}
