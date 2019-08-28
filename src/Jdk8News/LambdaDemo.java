package Jdk8News;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:09 2019/4/4
 * @Version: $
 * Lambda 表达式的简单例子:
 * // 1. 不需要参数,返回值为 5
 * () -> 5
 *
 * // 2. 接收一个参数(数字类型),返回其2倍的值
 * x -> 2 * x
 *
 * // 3. 接受2个参数(数字),并返回他们的差值
 * (x, y) -> x – y
 *
 * // 4. 接收2个int型整数,返回他们的和
 * (int x, int y) -> x + y
 *
 * // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
 * (String s) -> System.out.print(s)
 */
public class LambdaDemo {
    public static void main(String[] args) {
        LambdaDemo ld=new LambdaDemo();
//        类型声明
       MathOperation addition=(int a,int b)->a+b;
       //不用类型声明
       MathOperation subtraction=(a,b)->a-b;
     //大括号中的返回语句
        MathOperation multiplication=(int a,int b)->{return a*b;};
        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10 + 5 = " + ld.operate(10, 5, addition));
        System.out.println("10 - 5 = " + ld.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + ld.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + ld.operate(10, 5, division));
        System.out.println("10 / 5 = " + ld.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

    }
    interface MathOperation{
        int operation(int a,int b);
    }
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
