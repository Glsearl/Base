package day_eight;

public class code_block {
    {
        int i=10;
        System.out.println("输出i");
    }
       static {
           System.out.println("静态代码块");
       }
    {
        System.out.println("构造代码块1");
    }
    public code_block(){
        System.out.println("构造方法");
    }
}
class codeDemo{
    public static void main(String [] args){
        code_block cb=new code_block();
    }
}