package SeniorPost.inherit;

public class InhritanceDemo {
    public static void main(String[] args){
        String myShape ="circle";
        switch (myShape){
            case "circle":
                Circle circle=new Circle();
                circle.draw();
                break;
            case "square":
                Square square =new Square();
                square.draw();
                break;
        }
    }
}
