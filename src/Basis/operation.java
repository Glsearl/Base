package Basis;

import org.testng.annotations.Test;

public class operation {
    /*
     * 这里介绍场景的数学运算
     * 主要有 加减乘除 取模
     */
    @Test
    public static void main(String[] args){
        //相同类型变量，可以一行定义
        int x,y,result;
        x=90;
        y=40;
//        result=x+y;
//        result=x*y;
//        result=x/y;
        result=x%y;
        System.out.println("anwser ="+result);
    }
}
