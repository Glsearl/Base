package Polymorphism.packaging;

import java.util.ArrayList;


public class arrayList {
    //Arraylist
    public static void main(String[] args){
        java.util.ArrayList<Integer> mylist=new java.util.ArrayList<Integer>(5);
        mylist.add(1);
        mylist.add(133);
        mylist.add(21);
        mylist.add(26);
        mylist.add(84);
        for (Integer x:mylist){
            System.out.println(x);
        }
        System.out.println("Size="+mylist.size());
        mylist.remove(2);//根据下标删除，删除了21
        for (Integer x1:mylist){
            System.out.println(x1);
        }
        System.out.println("Size="+mylist.size());
        mylist.set(1,55);
        for (Integer x2:mylist){
            System.out.println(x2);
        }
    }
}
