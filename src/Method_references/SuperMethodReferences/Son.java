package Method_references.SuperMethodReferences;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 14:47 2019/5/13
 * @Version: $
 */
public class Son extends Father {
    @Override
    public void show() {
        System.out.println("this is son");
    }
    public static void buyPlaything(Person p){
        p.buy();
    }
    public void method(){
        buyPlaything(()->{new Father().show();});
        buyPlaything(super::show);
    }

    public static void main(String[] args) {
        new Son().method();
    }
}
