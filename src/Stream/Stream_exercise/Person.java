package Stream.Stream_exercise;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:12 2019/5/8
 * @Version: $
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
