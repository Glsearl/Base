package Polymorphism.packaging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDate {
    public static  void main(String[] args){
        Date date =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("E yyyy-MM-dd HH-mm-ss");
        //把时间按照字符串的格式输出
        System.out.println(sdf.format(date));
        sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        sdf =new SimpleDateFormat("yyyyMMdd-HHmmss");
        System.out.println(sdf.format(date));
        sdf =new SimpleDateFormat("yyyyMMdd-HHmmss.S");
        System.out.println(sdf.format(date));
    }
}
