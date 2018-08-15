package cn.foundation;

public class Demo1_Exception {
    public static void main(String[] args){

//        arr = null;
//        System.out.println(arr[1]);

      try {
          int[] arr = {11,22,33,44,55};
          int x = div(10,0);
          System.out.println(x);
          System.out.println(arr[10]);
      }catch (ArithmeticException a){
          System.out.println("除数为零！!!!");
      }catch (ArrayIndexOutOfBoundsException a){
          System.out.println("数组索引越界！!!!");
      }

    }

    private static int div(int a, int b) {
        return a/b;
    }

}
