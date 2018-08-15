package OO;

public class static_demo {
    public static String name;

    public static void DoSomethingWithStatic() {
        System.out.println("调用了Static方法");
    }

    public void DoSomethingWithNotStatic() {
        System.out.println("调用了非Static方法");
    }
}