package StringDemo;

import java.util.Scanner;

public class loginDemo {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";

        int x = 0;
        while (x < 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                   break;
            } else {
                System.out.println("您输入的账户名或密码有误");
            }
        }
    }
}
