package Method_references.ThisMethodReferences;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:35 2019/5/13
 * @Version: $
 */
public class Husband {
    public void marry(Richable r){
        r.buy();
    }
    private void buyHouse() {
        System.out.println("买套房子");
    }
    public void beHappy(){
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().beHappy();
    }
}
