/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:24 2019/6/28
 * @Version: $
 */
public class Bubble {
    public static void main(String[] args) {
     int [] arr={20,10,12,6,30};
     bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void bubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
class Select{
    public static void main(String[] args) {
        int [] arr={20,10,12,6,30};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void selectSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }    }
}}
