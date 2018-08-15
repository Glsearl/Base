package Basis;

public class variable_type{
    /*
     * 这里介绍Java中变量和变量类型
       byte (数字， 1 字节)
       short (数字， 2字节)
       int (数字， 4字节)
       long (数字， 8字节)
       float (单精度数字， 4字节)
       double （双精度数字， 8字节）
       char (一个字母，2字节)
       boolean (true or false, 1字节)
     */
    public static void main(String[] args) {
        int my_byte =10;
        short my_short_number=20;
        int x=3000;
        long y =535434535;
        float my_float_number=(float)4.2;
        double my_PI=3.1415926;
        char my_char ='A';
        boolean is_true=false;
        System.out.println(my_byte);
        System.out.println(my_short_number);
        System.out.println(x);
        System.out.println(y);
        System.out.println(my_float_number);
        System.out.println(my_PI);
        System.out.println(my_char);
        System.out.println(is_true);
    }
}
