package day_twenty_two.PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:31 2019/2/20
 * @Version: $version$
 */
public class PrintStreamDemo {
    public static void main(String[] args)throws IOException {
        PrintStream ps=new PrintStream(new File("ps.txt"));
        ps.print("hello");
        ps.print("java");
        ps.print("100");
        ps.close();
    }
}
