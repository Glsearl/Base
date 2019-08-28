package day_twenty_two.SystemStream;

import java.io.*;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:13 2019/2/21
 * @Version: $version$
 */
public class SystemOutDemo {
    public static void main(String[] args) throws IOException {
      OutputStream os=System.out;
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     bw.write("hello");
     bw.newLine();
     bw.flush();
     bw.write(10);
     bw.newLine();
     bw.flush();
     bw.close();
    }

}
