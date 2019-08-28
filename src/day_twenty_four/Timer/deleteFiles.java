package day_twenty_four.Timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:34 2019/3/6
 * @Version: $version$
 */
public class deleteFiles extends TimerTask {

    private static void deleteFolder(File srcfolder) {
        if (srcfolder.isDirectory()){
            File [] files=srcfolder.listFiles();
            for(File file:files){
                if (file.isDirectory()){
                    deleteFolder(file);
                }else {

                    System.out.println( file+":"+ file.delete());
                }

            }
           System.out.println(srcfolder+":"+srcfolder.delete());
        }
    }

    @Override
    public void run() {
        File srcfolder=new File("E:\\aaa");
        deleteFolder(srcfolder);
    }
}
class deletefile{
    public static void main(String[] args) throws ParseException {
        String time="2019-03-06 11:39:30";
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
        Date d=sdf.parse(time);
        Timer t=new Timer();
        t.schedule(new deleteFiles(),d);
    }

}