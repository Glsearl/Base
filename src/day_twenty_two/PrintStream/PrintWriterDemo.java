package day_twenty_two.PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:33 2019/2/20
 * @Version: $version$
 * PrintWriter pw=new PrintWriter(new FileWriter("pw.txt"),true);   设置自动刷新
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(new FileWriter("pw.txt"),true);
        pw.write("java");
        pw.write("hello");
        pw.write(100);
        pw.close();
    }
}
