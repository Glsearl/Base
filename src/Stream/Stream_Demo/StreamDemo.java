package Stream.Stream_Demo;

import java.util.ArrayList;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:07 2019/4/29
 * @Version: $
 * 用Stream改进ArrayList遍历
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList <>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        //对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        //遍历listB集合
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter((name->name.length()==3)).forEach(name->System.out.println(name));
    }
}
