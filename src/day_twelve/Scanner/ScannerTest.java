package day_twelve.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()){
            int a=sc.nextInt();
            System.out.println("输入数据为"+a );
        }else {
            System.out.println("输入数据不合法" );
        }
    }
}
