package day_ten.AnonymousLnnerClass;

public interface Person {
    public abstract void study();
}
class PersonDemo{
    public void meth(Person p){
        p.study();
    }
}
class PersomTest{
    public static void main(String[] args) {
        PersonDemo pd=new PersonDemo();
        pd.meth(new Person() {
            @Override
            public void study() {
                System.out.println("好好学习，天天向上");
            }
        });
    }
}