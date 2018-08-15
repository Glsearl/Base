package OO;

public class integration {
    public static void main(String[] args) {
        Rectangle rec =new Rectangle();
        Triangle tri= new Triangle();
        rec.set_values(10,20);
        tri.set_values(8,13);
        System.out.println(rec.area());
        System.out.println(tri.area());
    }


}

