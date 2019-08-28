package day_twenty_two.PrintStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:06 2019/2/21
 * @Version: $version$
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("fileName.txt"));
        PrintWriter pw=new PrintWriter("Copy.txt");
        String line=null;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
