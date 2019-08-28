package Method_references.ObjectMethodReferences;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:30 2019/5/13
 * @Version: $
 * 通过对象名进行方法引用
 */
public class Test {
    public static void printString(Printable p){
        p.print("hello");
    }
    public static void main(String[] args) {
//        Lambda
        printString((String s)->{PrintUtil pu=new PrintUtil();pu.printUpperCase(s);});
//        方法引用
        printString(new PrintUtil()::printUpperCase);
    }
}
