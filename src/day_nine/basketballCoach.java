package day_nine;

public class basketballCoach extends Coach  {
    @Override
    public void teaching() {
        System.out.println("篮球运动教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动教练吃香的喝辣的");
    }
}
