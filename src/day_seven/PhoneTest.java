package day_seven;

public class PhoneTest {
    public static void main(String[] args){
        Phone p= new Phone();
        p.setPrice(3999);
        p.setColor("白色");
        p.setBrand("华为");
        System.out.println("品牌："+p.getBrand()+"颜色："+p.getColor()+"价格："+p.getPrice());
    }
}
