package feb17.network.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost(); // 내 컴퓨터의 IP 정보를 구함 // InetAddress 타입의 객체가 나옴
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace(); //  exception 발생 시 에러 메시지 출력
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com"); // 배열로 리턴
            for (InetAddress ia : iaArray) {
                System.out.println(ia.getHostAddress()); // IPv4, IPv6
            }
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace(); //  exception 발생 시 에러 메시지 출력
        }
    }
}
