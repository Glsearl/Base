package SeniorPost.inherit;

public class Shape {
    //定义一个画图方法
    void Draw(){
        System.out.println("画一个形状");
    }
    //没有写具体实现擦除的方法
    void erase(){

    }
    //定义一个打印图形方法，该方法是不可以被子类改写
    final void print(){
        System.out.println("打印画出的图形");
    }
}
