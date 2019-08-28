package day_twenty.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:17 2019/1/21
 * @Version: $version$
 */
public class FileileWriterDemo {
    public static void main(String[] args) throws IOException {
//        File file=new File("Test.txt");
//        FileWriter writer=new FileWriter(file);
        FileWriter fw=new FileWriter("Test.txt");
        fw.write("你好啊");
        fw.close();
    }
}
