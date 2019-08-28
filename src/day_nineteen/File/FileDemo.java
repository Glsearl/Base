package day_nineteen.File;

import java.io.File;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:18 2019/1/15
 * @Version: $version$
 * 判断H盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 */
public class FileDemo {
    public static void main(String[] args) {
        File file=new File("H:\\");
        File[] files=file.listFiles();
        for (File file2:files){
            if (file2.isFile()){
                if (file2.getName().endsWith(".jpg")){
                    System.out.println(file2);
                }
            }
        }
    }
}
