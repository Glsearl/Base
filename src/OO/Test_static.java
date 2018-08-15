package OO;

public class Test_static {
    public static void main(String[] args){
        //调用静态方法和调用实例方法
        static_demo s_d=new static_demo();
        // 类本身调用静态方法
        s_d.DoSomethingWithStatic();
        // 实例对象调用实例方法，如果实例调用静态方法，会出现警告
        s_d.DoSomethingWithNotStatic();
             // 类本身调用静态成员变量
        static_demo.name="gaols";
        System.out.println(static_demo.name);
        s_d.name="Tom";
        System.out.println(s_d.name);
    }
}
