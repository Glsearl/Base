package day_nineteen.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:33 2019/1/15
 * @Version: $version$
 * 判断H盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 文件名称过滤器的实现思想及代码
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File dir=new File("H:\\");
        String[] files=dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // 通过这个测试，我们就知道了，到底把这个文件或者文件夹的名称加不加到数组中，取决于这里的返回值是true还是false
         // 所以，这个的true或者false应该是我们通过某种判断得到的
//           System.out.println(dir + "_" + name); //dir 表示目录 name表示目录后的名称,两者做拼接
          // File file = new File(dir, name); //根据一个父File对象和一个子文件/目录得到File对象
          // System.out.println(file);
                // boolean flag = file.isFile(); //判断是否是文件
         // boolean flag2 = name.endsWith(“.jpg”); //判断是否以.jpg结尾
         // return flag && flag2;
                return new File(dir,name).isFile()&&name.endsWith(".jpg");
            }
        });
      for (String file1:files){
          System.out.println(file1);
      }
    }
}
