package SeniorPost;

public class Constructor {
    public String name;
    public double speed;
    public String color;
    public Constructor(){
        this.name="ford";
    }
    public Constructor(String name) {
        this.name=name;
    }
    public Constructor(double speed){
        this.speed=speed;
    }
    public  Constructor(double speed,String name){
        this.speed=speed;
        this.name=name;
    }
}
