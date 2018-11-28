package day_nine;

public class TableTennisCoach extends Coach implements learningEnglish {
    @Override
    public void teaching() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃香的喝辣的");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练学英语");
    }
}
