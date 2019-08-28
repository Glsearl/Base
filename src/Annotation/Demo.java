package Annotation;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:02 2019/5/15
 * @Version: $
 * JDK中预定义的注解
 * @Override  检查当前重写的方法是否继承与父类
 * @SuppressWarnings("all")压制当前类所有的警告
 * @Deprecated 表示当前方法已过时，不建议使用了,但是还可以使用
 *
 */
@SuppressWarnings("all")
public class Demo {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
   public void show(){
        System.out.println("当前方法已经被弃用了");
   }

    public static void main(String[] args) {
        new Demo().show();
    }

}
/***
 *                    .::::.
 *                  .::::::::.
 *                 :::::::::::  FUCK YOU
 *             ..:::::::::::'
 *           '::::::::::::'
 *             .::::::::::
 *        '::::::::::::::..
 *             ..::::::::::::.
 *           ``::::::::::::::::
 *            ::::``:::::::::'        .:::.
 *           ::::'   ':::::'       .::::::::.
 *         .::::'      ::::     .:::::::'::::.
 *        .:::'       :::::  .:::::::::' ':::::.
 *       .::'        :::::.:::::::::'      ':::::.
 *      .::'         ::::::::::::::'         ``::::.
 *  ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 *                    '.:::::'                    ':'````..
 */