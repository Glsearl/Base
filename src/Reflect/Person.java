package Reflect;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:41 2019/3/29
 * @Version: $version$
 */
public class Person {
    private  String name;
    int age;
    public  String address;

    public Person() {
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void show(){
        System.out.println("show");
    }
    public void getAddress(String address){
        System.out.println("String"+"--------"+address);
    }
    public String method(String name,int age){
        return name+age;
    }
    private void getName(String name){
        System.out.println(name);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
