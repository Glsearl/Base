package SeniorPost;

public class Varargs {
    public static void main(String[] args){
        System.out.println(normalMethot(3,5));
        methodVarArgs(2,3,4,8,9,23,68);
        apendString("hello","java","你好");
        calcAverage(33.4,233.00,2455);
    }

    private static double calcAverage(double...numberOfUsersPerHour) {
        double totlUsers = 0;
        for (int i=0; i<numberOfUsersPerHour.length;i ++){
            totlUsers+=numberOfUsersPerHour[i];

        }
        System.out.println("totalUsers is"+totlUsers);
        return totlUsers;
    }

    private static void apendString(String ...s) {
        StringBuffer strb = new StringBuffer();
        for(String x:s){
            strb.append(x);
            strb.append("");
        }
        System.out.println(strb);
    }

    private static int methodVarArgs(int ...a) {
        int total =0;
        for (int i=0;i<a.length;i++){
            total+=a[i];
        }
        System.out.println("total is "+ total);
        return total;
    }

    private static int normalMethot(int a, int b) {
        return a+b;
    }
}
