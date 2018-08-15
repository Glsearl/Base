package Basis;

public class switch_demo {
    public static void main(String[] args){
        int score=99;
        switch (score)
        {
            case 90:
                System.out.println("优秀");
                break;
            case 80:
                System.out.println("良");
                break;
            case 70:
                System.out.println("中");
                break;
            case 60:
                System.out.println("及格");
                break;
            case 50:
                System.out.println("不及格");
                break;
                default:
                    System.out.println("分数等级未定义");
                    break;
        }
    }
}
