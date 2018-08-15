package SeniorPost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_copy2 {
    public static void main(String[] args){
        String[] a = {"BeiJing","ShangHai","HeNan","HenBei","ShanDong"};
        String[] b = new String[a.length];
        System.arraycopy(a,0,b,0,a.length);
        System.out.print(a==b);
        Array.set(a,2,"Wuhan");
        System.out.println("a"+ Arrays.toString(a));
        System.out.println("b"+Arrays.toString(b));
    }
}
