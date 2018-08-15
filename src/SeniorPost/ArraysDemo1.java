package SeniorPost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args){
        int[] a={10,20,30,40,50,60};
        //根据下标来得到元素
        int b=Array.getInt(a,2);
        System.out.println(b);
        //修改某一个元素
        Array.set(a,2,80);
        System.out.println(Arrays.toString(a));

        //排序（从小到大）
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //排序(从大到小),前提是利用前面已经排好的数组
        int len=a.length;
        for (int i=0;i<len/2;i++){
            int temp =a[i];
            a[i]=a[len-1-i];
            a[len-1-i]=temp;
        }
        System.out.println("逆序后："+Arrays.toString(a));
    }

}
