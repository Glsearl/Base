package Stream.Stream_Demo;

import java.util.ArrayList;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:31 2019/4/29
 * @Version: $
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList <>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        ArrayList<String> listA=new ArrayList <>();
        for (String s : list) {
            if (s.startsWith("张")){
                listA.add(s);
            }
        }
        ArrayList<String> listB=new ArrayList <>();
        for (String s : listA) {
            if (s.length()==3){
                listB.add(s);
            }
        }
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
