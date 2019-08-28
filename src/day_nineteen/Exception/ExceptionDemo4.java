package day_nineteen.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:40 2019/1/11
 * @Version: $version$
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        String time="2019-01-11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
//            编译期的异常必须处理
             date=sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

}
