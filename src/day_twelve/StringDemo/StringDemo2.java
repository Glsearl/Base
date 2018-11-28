package day_twelve.StringDemo;
//String类的判断功能
public class StringDemo2 {
    public static void main(String[] args) {
        String s1="hello word";
        String s2="hello word";
        String s3="Hello word";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-------------------");
//        忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("-------------------");
//        判断大字符串中是否包含小串
        System.out.println(s1.contains("hello"));
        System.out.println(s1.contains("hwo"));
        System.out.println("-------------------");
        //判断字符串是否以某个指定的字符串开头
        System.out.println(s1.startsWith("he"));
       //判断字符串是否以某个指定的字符串结尾
        System.out.println(s1.endsWith("ord"));
//        判断字符串是否为空
        System.out.println(s1.isEmpty());
    }
}
