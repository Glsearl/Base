package day_twenty.IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:12 2019/1/19
 * @Version: $version$
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Test.txt");

        fr.close();
    }
}