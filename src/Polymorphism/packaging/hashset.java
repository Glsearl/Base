package Polymorphism.packaging;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashset {
    public static void main(String[] args){
        HashSet<String> name =new HashSet <String>();
        name.add("zhang");
        name.add("mark");
        name.add("tom");
        name.add("john");
        name.add("jack");
        //从上往下  遍历list元素
        Iterator<String> itr=name.iterator();
        while ( itr.hasNext()){
            System.out.println(itr.next());

        }
}
}
