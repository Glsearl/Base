package Stream_File_IO;

import java.io.*;

/**
 * 读取文件内容操作
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f =new File("C://Users//Gaols//Desktop//Demo.txt");
        InputStream out =new FileInputStream(f);
        System.out.println("文件路径是"+f);
        int size = out.available();
//        循环遍历
        for (int i=0;i< size;i++){
            System.out.print("读取到的文件内容是"+(char) out.read());

        }
        out.close();
    }
}
