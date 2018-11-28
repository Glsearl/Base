package day_thirteen.StringBuffer;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:54 2018/11/27
 * @Version: $version$
 */
public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        //添加功能
        buffer.append("Hello Word").append("你好世界").append('a').append(123);
        System.out.println("buffer:" + buffer);
        System.out.println("buffer的实际长度:" + buffer.length());
        System.out.println("buffer的长度:" + buffer.capacity());
        System.out.println("--------------------------------");
        buffer.insert(5, "java");
        System.out.println("buffer:" + buffer);
        System.out.println("buffer的实际长度:" + buffer.length());
        System.out.println("buffer的长度:" + buffer.capacity());
        System.out.println("--------------------------------");
        //删除功能
        buffer.deleteCharAt(5);
        System.out.println("buffer:" + buffer);
        buffer.delete(5, 8);
        System.out.println("buffer:" + buffer);
        System.out.println("--------------------------------");
//        替换功能
        buffer.replace(10, 14, "java");
        System.out.println("buffer:" + buffer);
        System.out.println("--------------------------------");
        //反转功能
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("cba");
        stringBuffer.reverse();
        System.out.println("stringBuffer:" + stringBuffer);
        System.out.println("--------------------------------");
        //截取功能（返回的是String类型）
        String s = buffer.substring(5);
        System.out.println("buffer:" + buffer);
        System.out.println("s:" + s);
        System.out.println("--------------------------------");
        String s1 = buffer.substring(5, 10);
        System.out.println("buffer:" + buffer);
        System.out.println("s1:" + s1);
        System.out.println("--------------------------------");

    }
}
