package day_twenty.Recursive;

import java.io.File;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 17:19 2019/1/17
 * @Version: $version$
 * 递归删除带内容的目录
 */
public class deleteFile {
    public static void main(String[] args) {
        File dir=new File("E:\\测试备份文件");
        delete(dir);
    }
    public static void delete(File dir){
        File[] files=dir.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                delete(file);
            }else {
                System.out.println(file.getName()+"---"+file.delete());
            }
        }
        System.out.println(dir.getName()+"-----"+dir.delete());
    }
}
