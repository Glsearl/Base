package Basis;

public class sum1 {
    public static void main(String[] args){
        int total=sum(10,20);
        System.out.println(total);

        boolean equi =eq(30,40);
        System.out.println(equi);
        int ma=Max(10,20);
        System.out.println(ma);

        xing(5,4);
       MultiplicationTable(9,9);

    }
    public static int sum(int a,int b){
      int  c=a+b;
      return c;

    }
    public static int sum(int a,int b,int c){
        int  d=a+b+c;
        return d;

    }
    //判断两个数是否相等
    public static boolean eq(int a,int b){
        if (a==b){
            return true;
        }else {
            return false;
        }
    }
    //判断两个数的最大值
    public static int Max(int c,int d){
        if (c>d){
            return c;
        }else {
            return d;
        }

    }
    //打印星星    m表示行数，n表示列数
    public static void xing(int m,int n){
        for (int x=0;x<m;x++){
            for (int y=0;y<=n;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void MultiplicationTable(int m,int n){
        for (int x=0;x<m;x++){
            for (int y=0;y<x;y++){
                System.out.print("m"+"*"+"n"+"="+"m*n"+"\t");
            }
            System.out.println("");
        }

    }
}
