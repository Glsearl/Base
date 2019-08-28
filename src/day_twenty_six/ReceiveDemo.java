package day_twenty_six;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:44 2019/3/20
 * @Version: $version$
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(6666);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        byte[] byt = dp.getData();
        String str = new String(byt, 0, byt.length);
        InetAddress address=dp.getAddress();
        System.out.println(address+"发送的内容是："+str);
        ds.close();
    }
}
