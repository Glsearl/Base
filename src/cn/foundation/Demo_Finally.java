package cn.foundation;

public class Demo_Finally {
    public static void main(String[] args){
        try {
            System.out.println(10/2);
        }catch (Exception e){
            System.out.println("除数为零了");
            //无论什么情况finally一定会执行
        }finally {
            System.out.println("除数不能为零");
        }
    }
}
