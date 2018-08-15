package SeniorPost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_copy {
    public static void main(String[] args){
        int[] a={10,20,30,40,50,60};
        int[] b=a;
        System.out.println(a==b);
        Array.set(a,2,100);
        System.out.println("a"+Arrays.toString(a));
        System.out.println("b"+Arrays.toString(b));

    }
}
