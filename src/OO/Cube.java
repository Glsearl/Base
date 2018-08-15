package OO;

public class Cube {
   int length;
   int width;
   int height;
   public int getCubeVolum(){
       return (length*width*height);
   }
   //定义一个参数为空的构造函数
   Cube(){
      length=10;
      width=20;
      height=30;
   }
   //定义一个有三个参数的构造函数
    Cube(int l,int w,int h){
       length=l;
       width=w;
       height=h;
    }
}
