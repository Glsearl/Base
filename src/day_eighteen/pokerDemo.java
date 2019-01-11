package day_eighteen;

import java.util.*;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:27 2019/1/7
 * @Version: $version$
 */
public class pokerDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap <Integer, String>();
        ArrayList<Integer> array=new ArrayList <Integer>();
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors={"♠","♥","♦","♣"};
        int index=0;
        for (String number:numbers){
            for (String color:colors){
                String poker=number.concat(color);
                hm.put(index,poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);
       // System.out.println(hm);
//        洗牌
        Collections.shuffle(array);
//        发牌
        TreeSet<Integer>  wangZhenYu=new TreeSet <Integer>();
        TreeSet<Integer>  baoZhaTian=new TreeSet <Integer>();
        TreeSet<Integer>  wangJiDong=new TreeSet <Integer>();
        TreeSet<Integer>  diPai=new TreeSet <Integer>();
        for (int i=0;i<array.size();i++){
            if (i>=array.size()-3){
                diPai.add(array.get(i));
            }else if (i%3==0){
                wangJiDong.add(array.get(i));
            }else if (i%3==1){
                wangZhenYu.add(array.get(i));
            }else if (i%3==2){
                baoZhaTian.add(array.get(i));
            }
        }
        lookPoker("王振宇",wangZhenYu,hm);
        lookPoker("爆炸天",baoZhaTian,hm);
        lookPoker("王激动",wangJiDong,hm);
        lookPoker("底牌",diPai,hm);
    }
//    看牌
    public static void lookPoker(String name,TreeSet<Integer> set,HashMap<Integer,String> hm){
        System.out.print(name+"的牌: ");
        for (Integer key:set){
            String value=hm.get(key);
            System.out.print(value);
        }
        System.out.println();
    }
}
