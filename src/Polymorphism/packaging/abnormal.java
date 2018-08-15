package Polymorphism.packaging;

public class abnormal {
    public static int retInt(){
        int a=100;
        try{
//            return a ;
            return a/0;
        }catch (ArrayStoreException e){
            System.out.println("调用catch语句块");
            System.out.println(e);
            return a;
        }finally {
            System.out.println("调用finally语句块");
        }
    }
    public static void main(String[] args){
        System.out.println(retInt());
    }
}
