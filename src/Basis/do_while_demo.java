package Basis;

public class do_while_demo {
    public static void main(String[] args){
        int a=1;
        int sum=0;
        while (a<=100){
            sum+=a;
            a++;
        }
        System.out.println(sum);
        int x=1;
        int sum1=0;
        do {
            sum1+=x;
            x++;
        }while (x<=100);
        System.out.println(sum1);
    }
}
