package day_nineteen.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:56 2019/1/15
 * @Version: $version$
 * 判断H盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 *  * 文件名称过滤器的实现思想及代码
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File file=new File("H:\\");
        File[] files=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile()&& name.endsWith(".jpg");
            }
        });
        for (File file2:files){
            System.out.println(file2.getName());
        }

    }
}
