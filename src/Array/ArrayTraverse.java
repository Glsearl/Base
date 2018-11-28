package Array;

public class ArrayTraverse {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6};
        //循环遍历数组
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        //查找数组中的最大值
        int max =getMax(arr);
       System.out.println(max);
        //查找数组中的最小值
        int min =getMin(arr);
        System.out.println(min);
        //逆序
        reversedOrder(arr);
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void reversedOrder (int[] arr){
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
