package Jdk8News;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:11 2019/4/4
 * @Version: $
 */
public class Java8Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList <>();
        list.add("Google");
        list.add("sina");
        list.add("Baidu");
      ArrayList<String> list1=new ArrayList <>();
        list1.add("Jd");
        list1.add("Alibaba");
        list1.add("Taoba");
        Java8Test test=new Java8Test();
        System.out.println("使用java7的语法：");
        test.sortUsingJava7(list);
        System.out.println(list);

        System.out.println("使用java8的语法：");
        test.sortUsingJava8(list1);
        System.out.println(list1);
    }
    private void sortUsingJava7(ArrayList<String> list){
        Collections.sort(list, new Comparator <String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }
    private void sortUsingJava8(ArrayList<String> list){
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
    }
}
