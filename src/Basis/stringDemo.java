package Basis;

public class stringDemo {
    public static void main(String[] args){
        //用关键字String来定义一个字符串变量
        String myString ="Hello a world abc";
        //计算长度
        System.out.println(myString.length());
        //转成小写
        System.out.println(myString.toLowerCase());
        //转大写
        System.out.println(myString.toUpperCase());
        //字符串链接
        String str1 ="Hello";
        String str2 ="Word";
        System.out.println(str1+str2);
        //替换字母
        System.out.println(myString.replace('a','Y'));
        //查找某一个字母的索引
        System.out.println(myString.indexOf('w'));
        //字符串切割
        System.out.println(myString.substring(1,9));//从左到右，包括索引1，但是右边界不包含索引9
        //从索引为4，包含4开始切割，4之前的不要
        System.out.println(myString.substring(4));
    }
}
