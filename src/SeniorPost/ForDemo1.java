package SeniorPost;

import java.util.ArrayList;
import java.util.Collection;

public class ForDemo1 {
    public static void main(String args[]){
        Collection<StringBuffer> bufferlist=new ArrayList <StringBuffer>();
        ((ArrayList<StringBuffer>) bufferlist).add(new StringBuffer("gaols"));
        ((ArrayList<StringBuffer>) bufferlist).add(new StringBuffer("Tom"));
        ((ArrayList<StringBuffer>) bufferlist).add(new StringBuffer("Jhon"));
        //实现每个名称内单词顺序翻转
        for (StringBuffer name:bufferlist){
            name.reverse();
        }
        System.out.println(bufferlist);
    }
}
