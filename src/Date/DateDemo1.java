package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 计算出生了多长时间
 */
public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        DateFormat df1=new SimpleDateFormat();
       String today= df1.format(date);
        System.out.println(today);
//        计算出生了多长时间
        String BirthdayTime="1995年8月2日";
        String currentTime="2018年9月17日";
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        Date d1=df.parse(BirthdayTime);
        Date d2=df.parse(currentTime);
        long time=d2.getTime()-d1.getTime();
        System.out.println(time/1000/60/60/24/365);
    }
}
