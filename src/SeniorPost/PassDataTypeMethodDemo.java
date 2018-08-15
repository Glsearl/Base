package SeniorPost;

import java.util.ArrayList;
import java.util.List;

public class PassDataTypeMethodDemo {
    public static void main(String[] args){
        List list =new ArrayList();
        list.add("aaa");
        changgeList(list);
        System.out.println(list.toString());
    }

    private static void changgeList(List list) {
        list.add("bbb");
    }
}
