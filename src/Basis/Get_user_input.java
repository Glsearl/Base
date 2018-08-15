package Basis;

import java.util.Scanner;
/*
获取用户输入内容，通过Scanner类来实现
 */
public class Get_user_input {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入一些整数");
        int user_input_number = scan.nextInt();
        System.out.println("刚刚输入的是：");
        System.out.println(user_input_number);

        Scanner scan1 =new Scanner(System.in);
        System.out.println("请输入一些小数");
        double user_input_decimal = scan.nextDouble();
        System.out.println("刚刚输入的是：");
        System.out.println(user_input_decimal);

        Scanner scan2 =new Scanner(System.in);
        System.out.println("请输入一些字符串");
       String user_input_string = scan.nextLine();
        System.out.println("刚刚输入的是：");
        System.out.println(user_input_string);
    }
}
