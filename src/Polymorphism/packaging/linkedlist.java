package Polymorphism.packaging;

import java.util.LinkedList;

public class linkedlist{

    public static void main(String[] args){

        LinkedList<String> mylist = new LinkedList<String>();
        mylist.add("Tom");
        mylist.add("Lucy");
        mylist.add("Anthony");
        mylist.add("tina");
        mylist.add("luca");

        // 遍历链表
//        for(String x : mylist){
//            System.out.println(x);
//        }
//
//        // 打印链表元素个数
//        System.out.println("Size= "+mylist.size());
//
//        //添加第一个元素
//        mylist.addFirst("Bobo");
//
//        // 末尾添加一个元素
//        mylist.addLast("Zara");
//
//        // 遍历链表，检查插入第一个和最后一个是否正确
//        for(String x : mylist){
//            System.out.println(x);
//        }
//
//        //删除第一个和最后一个
//        mylist.removeLast();
//        mylist.removeLast();
//
//        for(String x : mylist){
//            System.out.println(x);
//        }

        //清空该链表
        mylist.clear();

        // 这里打印出来是空，为了观察效果，建议把前面打印代码注销
        for(String x : mylist){
            System.out.println(x);
        }

    }


}