package Method_references.MethodReferences;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:50 2019/5/10
 * @Version: $
 * 方法的引用
 */
public class Demo {
    public static void printString(String str,Printable p){
        p.print(str);
    }
    public static void main(String[] args) {
        printString("hello",(s)->{System.out.println(s);});
        printString("java",System.out::println);
    }

}
