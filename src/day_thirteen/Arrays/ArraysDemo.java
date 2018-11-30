package day_thirteen.Arrays;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:00 2018/11/30
 * @Version: $version$
 */
public class ArraysDemo {
    public static void main(String[] args) {
    int [] arr={11,22,33,44,55,66};
    ArraysDemo.getIndex(arr,22);
    System.out.println( ArraysDemo.getIndex(arr,22));
    }
        public static int getIndex(int[] arr,int vlue){
          int maxIndex=arr.length-1;
          int minIndex=0;
          int mid =(maxIndex+minIndex)/2;
          while (vlue!=arr[mid]){
              if (vlue<arr[mid]){
                  maxIndex=mid-1;
              }else if (vlue>arr[mid]){
                  minIndex=mid+1;
              }if (minIndex>maxIndex){
                  return -1;
              }
              mid=(minIndex+maxIndex)/2;
          }
          return mid;
    }

}
