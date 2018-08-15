package Polymorphism.packaging;

public class exceptionHandling {
    public static void main(String[] args){
        int b[]=new int[2];
        try {
//            int a=100/0;
            System.out.println("索引为3的元素值为"+b[3]);
        }catch (Exception e){
            System.out.println(e);

        }

        System.out.println("--------------------------------");
    }
}
