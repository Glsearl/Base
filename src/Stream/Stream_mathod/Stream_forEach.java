package Stream.Stream_mathod;

import java.util.ArrayList;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 15:59 2019/4/29
 * @Version: $
 *  Stream流中的常用方法_forEach
 *     void forEach(Consumer<? super T> action);
 *     该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
 *     Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据
 *
 *     简单记:
 *         forEach方法,用来遍历流中的数据
 *         是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 *
 */
public class Stream_forEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList <>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().forEach(name->System.out.println(name));
    }
}
