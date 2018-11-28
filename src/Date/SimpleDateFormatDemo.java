package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String time="2008年08月08日 08:08:08";
        DateFormat df =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//指定格式化效果
       Date date = df.parse(time);//将字符串转成日期指定格式
        System.out.println(date);//完成时间日期格式转换成字符串
    }
}
