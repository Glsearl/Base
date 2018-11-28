package day_thirteen.StringBuffer;

import java.util.Scanner;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:46 2018/11/28
 * @Version: $version$
 */
//举例：键盘录入”abc”		输出结果：”cba”
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String str = scanner.nextLine();
        String st = HomeWork1.reversal(str);
        System.out.println(st);
        String stb = HomeWork1.myreversal(str);
        System.out.println(stb);
    }

    public static String reversal(String str) {
        String s = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            s += ch[i];
        }
        return s;
    }
    public static String myreversal(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
