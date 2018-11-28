package day_seven;

public class rectangle {
    private int Width;
    private int lenght;
    public rectangle(){

    }

    public int getWidth() {
        return Width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public static int getSide (int lenght,int width){
        return (lenght+width)*2;
    }
    public static int getArea(int lenght,int width){
        return lenght*width;
    }
}
