package OO;

public class TestCube {
    public static void main(String[] args){
        Cube c1= new Cube();
        System.out.println(c1.getCubeVolum());
        Cube c2=new Cube(20,20,20);
        System.out.println(c2.getCubeVolum());
    }
}
