package Basis;

/*
 * if else 条件控制语句
 * 相关练习
 *
 */
public class judge {
     /*
     if -else语句一般的语法格式如下
     if(布尔条件表达式){
        执行条件为真的操作

     } else{
        执行条件为假的操作
     }

     */
//     public static void main(String[] args) {
//         int a =50;
//         int b=100;
//         if (a==b){
//             System.out.println("a和b相等");
//         }else{
//             System.out.println("a和b不相等");
//         }
//     }
public static void main(String[] args) {
         int a =50;
         int b=100;
         int c=200;
         if (a>b){
          if (a>c){
              System.out.println(a);
          }else {
              System.out.println(c);
          }
         }else {
             if (b>c){
                 System.out.println(b);
             }else {
                 System.out.println(c);
             }
         }
     }
}