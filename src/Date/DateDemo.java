package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
//        DateFormat df =new SimpleDateFormat();//空参垢找方法，不指定格式化效果
//        String time = df.format(date);//调用父类DateFormat里面的格式化方法。
//        System.out.println(time);//完成时间日期格式转换成字符串Date date=new Date();
        DateFormat df =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//指定格式化效果
        String time = df.format(date);//调用父类DateFormat里面的格式化方法。
        System.out.println(time);//完成时间日期格式转换成字符串
    }

}
