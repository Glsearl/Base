package SeniorPost;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_copy1 {
    public static void main(String[] args){
           String[] a = {"BeiJing","ShangHai","HeNan","HenBei","ShanDong"};
           //.clone()为复制方法，a数组中修改数据不影像b数组的数据
            String[] b = a.clone();
            System.out.println(a==b);
            Array.set(a,2,"WuHan");
            System.out.println("a"+Arrays.toString(a));
            System.out.println("b"+Arrays.toString(b));

        }
}


