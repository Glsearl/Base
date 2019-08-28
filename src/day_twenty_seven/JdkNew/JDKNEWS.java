package day_twenty_seven.JdkNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:24 2019/4/3
 * @Version: $
 */
public class JDKNEWS {
    public static void main(String[] args) {
        //二进制字面量
        int a=0b1100100;
        System.out.println(a);
//        数字字面量可以出现下划线
        int i=100_0000;
        System.out.println(i);
//        switch 语句可以用字符串
        String  str="hello";
        switch (str){
            case "hello":
                System.out.println("hello");
                break;
            case "word":
                System.out.println("wrod");
                break;
        }
//                泛型简化
        ArrayList<String> array=new ArrayList <>();
//        异常的多个catch合并
        try {
            FileInputStream fis=new FileInputStream("a.txt");
            FileOutputStream fos=new FileOutputStream("b.txt");
            int len=0;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException | FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try-with-resources 语句
        try(FileInputStream fis=new FileInputStream("a.txt");
            FileOutputStream fos=new FileOutputStream("b.txt")){
            int len=0;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
