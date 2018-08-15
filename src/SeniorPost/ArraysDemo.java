package SeniorPost;

public class ArraysDemo {
    public static void main(String[] args){
        int[] numbers =new int[12];
        String[] str=new String[100];
        int [] myArray;
        myArray=new int[10];
        int[] a={10,20,30,40,50,60};
        //需求：输出数组每个元素的位置和值
        System.out.println("第一种遍历数组元素方式");
        for (int i=0;i <a.length;i++){
            System.out.println(i+"\t"+a[i]);
        }
        //第二种for循环比遍历数组元素
        System.out.println("第2种遍历数组元素方式");
        for(int x : a){
            System.out.print("\t"+x);
        }
    }
}

