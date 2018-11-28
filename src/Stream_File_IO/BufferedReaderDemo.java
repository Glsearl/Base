package Stream_File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * char类型读取控制台录入的字符
 * 读取控制台录入的字符串数据
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        String a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下‘q’键退出");
        //读取字符
        do {
            a =br.readLine();
            System.out.println("读取到的数据是："+a);
        }while (!a.equals("q"));

    }
}
