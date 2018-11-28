package day_nine;

public class Test {
    public static void main(String[] args) {
        //乒乓球运动员
        paddler pd=new paddler();
        pd.setName("张三");
        pd.setAge(23);
        pd.eat();
        pd.speak();
        pd.study();
        pd.sleep();
        System.out.println("_____________________________________");
        //乒乓球教练
        TableTennisCoach tc= new TableTennisCoach();
        tc.setName("李四");
        tc.setAge(23);
        tc.eat();
        tc.speak();
        tc.sleep();
        tc.teaching();
        System.out.println("_____________________________________");

        //篮球运动员
        basketballPlayer bp=new basketballPlayer();
        bp.setName("姚明");
        bp.setAge(23);
        bp.eat();
        bp.study();
        bp.sleep();
        System.out.println("_____________________________________");
        //篮球运动员教练
        basketballCoach bc =new basketballCoach();
        bc.setName("王二妮");
        bc.setAge(23);
        bc.eat();
        bc.sleep();
        bc.teaching();
    }
}
