package day_nineteen.Exception;

import java.text.SimpleDateFormat;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:21 2019/1/11
 * @Version: $version$
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr={1,2,3};
        String time="2019-01-11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-hh");
//        Date d=sdf.parse(time);
        try {

            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException e){
            e.printStackTrace();
            //第二个异常不会执行，try里面的代码一旦有异常，后面的代码就不会再执行，所以第二个异常不会走
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("over");
    }
    }

