package Polymorphism.packaging;

public class Recursion {
    /*
     N! = N*(N-1)*(N-2)*...2*1
     5!= 5x4x3x2x1
    */
    public static int factorial(int N){
        if (N<=1)
            return 1;
        else {
            return (N*factorial(N-1));
        }

    }
        public static void main(String[] args){
        System.out.println(factorial(10));
        }

}
