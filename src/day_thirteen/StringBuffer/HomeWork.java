package day_thirteen.StringBuffer;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 9:48 2018/11/28
 * @Version: $version$
 */
//举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]
public class HomeWork {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = HomeWork.Splice(arr);
        System.out.println(str);
        System.out.println("---------------------");
        String stb = HomeWork.Splicing(arr);
        System.out.println(stb);
    }

    public static String Splice(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
                s += "]";
            } else {
                s += arr[i];
                s += ", ";
            }

        }
        return s;
    }
    public static String Splicing(int[] arr) {
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]) ;
                sb.append("]");
            } else {
                sb.append(arr[i]) ;
                sb.append(", ");
            }

        }
        return sb.toString();
    }
}
