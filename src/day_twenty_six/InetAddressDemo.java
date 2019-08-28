package day_twenty_six;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:05 2019/3/20
 * @Version: $version$
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("192.168.10.111");
        String ip=address.getHostAddress();
        String name=address.getHostName();
        System.out.println(name+"---"+ip);
    }
}
