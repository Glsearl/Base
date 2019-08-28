package day_twenty.Recursive;

import java.io.File;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:27 2019/1/17
 * @Version: $version$
 * 递归遍历目录下指定后缀名结尾的文件名称
 */
public class FilePathDemo {
    public static void main(String[] args) {
        File dir=new File("G:\\测试文档");
        getFilePath(dir);
    }
    public static void getFilePath(File dir){
        File [] files=dir.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                getFilePath(file);
            }else {
                if ((file.getName().endsWith(".docx"))){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
