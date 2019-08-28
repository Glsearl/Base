package day_nineteen.File;

import java.io.File;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:42 2019/1/16
 * @Version: $version$
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File file=new File("H:\\");
        File[] files=file.listFiles();
        for (File fil:files){
            if (fil.isFile()){
                String oldName=fil.getName();
//                System.out.println(oldName);
                int index=oldName.indexOf("-");
                String startName=oldName.substring(0,index);
                int endIndex =oldName.lastIndexOf(".");
                String endName=oldName.substring(endIndex-3);
                String newName=startName.concat(endName);
                File newfile=new File("H:\\"+newName);
                fil.renameTo(newfile);
               System.out.println(fil.getName());
            }
        }
    }
}
