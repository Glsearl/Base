package day_twenty_two.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:41 2019/2/22
 * @Version: $version$
 */
public class RandomAccessFileDemo2 {
    public static void main(String[] args) throws IOException {
//        writer();
        read();

    }

    public static void read()throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ps.txt","rw");
        raf.seek(10);
        int i=raf.readInt();
        System.out.println("读取到的元素为："+i+raf.getFilePointer());
        String s=raf.readUTF();
        System.out.println("读取到的元素为："+i+raf.getFilePointer());
    }
    public static void writer() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ps.txt","rw");
        raf.writeUTF("中国");
        raf.writeInt(102);

    }
}

