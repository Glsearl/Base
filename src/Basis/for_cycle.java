package Basis;

public class for_cycle {
    /*
        for(变量初始化；循环控制表达式；自增表达式){
          //代码块
    }
     */
    public static void main(String[] args){
        int[] myarry={10,40,50,20,90};
        for (int i=0;i<myarry.length;i++){
            System.out.println(myarry[i]);
        }
        System.out.println("----------------------------------------");
        int sum=0;
        for (int j=0;j<=100;j++){
            sum+=j;
        }
        System.out.println(sum);
    }
}
