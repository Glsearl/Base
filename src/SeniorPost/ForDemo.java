package SeniorPost;

public class ForDemo {
    public static void main(String[] args){
        int[] number ={12,36,45,47,52,96,44};
        //增强for循环
        for (int x:number){
            System.out.println(x);
        }
        System.out.println("-------------------------------------------");

        //普通for循环
        for (int i=0;i <number.length;i++){
            System.out.println(number[i]);
        }
    }
}
