package day_ten;

public interface Person {
    public abstract void eat();
}
class baby implements Person{

    @Override
    public void eat() {
        System.out.println("喝奶");
    }
}
class child{
    public void drinkMilk(Person p){
        p.eat();
    }
}
class PersonTest{
    public static void main(String[] args) {
      child c=new child();

    }
}