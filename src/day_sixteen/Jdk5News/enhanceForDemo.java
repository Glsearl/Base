package day_sixteen.Jdk5News;

import java.util.ArrayList;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:05 2018/12/21
 * @Version: $version$
 */
public class enhanceForDemo {
    public static void main(String[] args) {
        int [] arry={1,2,3,4,5,6};
        for (int i:arry){
            System.out.println(i);
        }
        ArrayList<String> list =new ArrayList <>();
        list.add("hello");
        list.add("word");
        list.add("java");
        for (String s:list){
            System.out.println(s);
        }
    }
}
