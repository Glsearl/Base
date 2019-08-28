package day_twenty_six;

import java.io.IOException;
import java.net.*;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:37 2019/3/20
 * @Version: $version$
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bytes="hello,UDP".getBytes();
        int lengh=bytes.length;
        InetAddress address=InetAddress.getByName("192.168.10.111");
        DatagramPacket dp=new DatagramPacket(bytes,lengh,address,6666);
        ds.send(dp);
        ds.close();
    }
}
