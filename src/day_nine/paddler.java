package day_nine;

public class paddler extends player implements learningEnglish{
    @Override
    public void study() {
        System.out.println("联系乒乓球");
    }

    @Override
    public void eat() {
     System.out.println("乒乓球运动员吃一般能量食物");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员学习英语");
    }
}
