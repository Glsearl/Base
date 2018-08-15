package SeniorPost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_copy3 {
    public static void main(String[] args){
        String[] a = {"BeiJing","ShangHai","HeNan","HenBei","ShanDong"};
        String[] b = Arrays.copyOf(a,a.length);
        System.out.println(a==b);
        Array.set(a,2,"Wuhan");
        System.out.println("a"+ Arrays.toString(a));
        System.out.println("b"+Arrays.toString(b));
    }
}
