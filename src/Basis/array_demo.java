package Basis;

import java.util.IllformedLocaleException;

public class array_demo {
    public static void  main(String[] args){
        int[] myarry={1,4,5,2,9};
        //还有其他的创建数组方式
        /*
         int[] myArry = new int[3]; //定义一个数组，有3个元素
         int[] myArry = {1,2,3};    //给这个数组赋值
         int[] myArry = new int[]{1,2,3};  //上面两行可以简写成这一行
         */
        //取数组中下标为0的元素
        System.out.println("数组索引为0的元素为："+myarry[0]);
        System.out.println("数组索长度为："+myarry.length);
        //遍历数组元素
//        while (index < myarry.length){
//            System.out.println(myarry[index]);
//            index++;
//        }
        //利用for循环遍历数组元素
        for (int index=0;index <myarry.length;index++){
            System.out.println(myarry[index]);
        }
    }
}
