package day_nineteen.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:08 2019/1/11
 * @Version: $version$
 * throws关键字
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {

        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void method() throws ParseException {
        String time="2019-01-11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(time);
    }

}
