package day_thirteen.StringBuffer;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:34 2018/11/27
 * @Version: $version$
 */
//StringBuffer to String    and    String to StringBuffer
public class StringBufferDemo2 {
    public static void main(String[] args) {
         //String转Stringbuffer的两种方式，一种是通过append的方法，一种是通过构造方法
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Hello javaSE");
        System.out.println(stringBuffer);
        String s="Are you ok";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb);
        System.out.println("----------------------");
        //StringBuffer转String的两种方式，一种是通过构造方法，一种一种是通过toSting方法
        StringBuffer buffer =new StringBuffer();
        buffer.append('a').append(123).append(29.50f).append("你好");
        String str=new String(buffer);
        System.out.println(buffer);
        System.out.println("----------------------");
        String s1= buffer.toString();
        System.out.println(s1);


    }
}
