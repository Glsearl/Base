package SeniorPost;

public class stringClassDemo {
    public static void main(String[] args){
//        String s1="Hello world";
//        if (!s1.isEmpty()){
//            System.out.println(s1.length());
//        }
//        System.out.println("索引为2对应的字母是"+s1.charAt(2));
        String s1="Hello world";
        String s2="Hello java";
        //判断两个字符串是否相等
        if (s1.equals(s2)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
        //判断s1是否以He开头
        if (s1.startsWith("He")){
            System.out.println("s1字符串是以He开头的");
        }
        //判断s2是否以java结尾的
        if (s2.endsWith("java")){
            System.out.println("s2字符串是以java结束的");

            //返回S1中字母d的下标
            System.out.println("s1 中字母d的索引为： "+ s1.indexOf('d'));

            //返回索引从3到8的子字符串
            System.out.println("索引从3到8的子字符串： "+ s1.substring(3,8));

            //拼接
            System.out.println("拼接到后面： "+ s1.concat("abcd"));

            //替换单个字母
            System.out.println("替换单个字母： "+ s1.replace('H','z'));

            //替换第一个字母
            System.out.println("替换第一个字母： "+ s2.replaceFirst("H","AABB"));

            //是否包含world
            System.out.println("是否包含world： "+ s1.contains("world"));

            //根据空格切割
            System.out.println("根据空格切割： "+ s1.split(" ")[0] +" " + s1.split(" ")[1]);
    }
 }
}
