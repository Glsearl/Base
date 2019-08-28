package FunctionalInterface.Supplier;

import java.util.function.Supplier;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 16:06 2019/4/29
 * @Version: $
 * 使用Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。提示：接口的泛型请使用java.lang.Integer 类。
 */
public class SupplierDemo {
    public static int getMax(Supplier <Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 52, 333, 23};
        int Max = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("最大数是：" + Max);
    }
}
