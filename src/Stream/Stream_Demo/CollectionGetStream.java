package Stream.Stream_Demo;

import java.util.*;
import java.util.stream.Stream;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:33 2019/4/29
 * @Version: $
 *  java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
 *     获取一个流非常简单，有以下几种常用的方式：
 *         - 所有的Collection集合都可以通过stream默认方法获取流；
 *             default Stream<E> stream​()
 *         - Stream接口的静态方法of可以获取数组对应的流。
 *             static <T> Stream<T> of​(T... values)
 *             参数是一个可变参数,那么我们就可以传递一个数组
 */
public class CollectionGetStream {
    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        Stream <String> stream = list.stream();
        Set <String> set = new HashSet <>();
        Stream <String> stream1 = set.stream();
        Map<String,String> map=new HashMap();
       Set<String> set1= map.keySet();
       Stream<String> stream2=set1.stream();
        Collection<String>collection= map.values();
      Stream<String> stream3= collection.stream();
      Set<Map.Entry<String,String>> entries=map.entrySet();
     Stream<Map.Entry<String,String>> stream4= entries.stream();

     Integer[] integers={1,2,3,4,5,6};
     Stream<Integer> stream5=Stream.of(integers);

     String[] str={"aa","bb","ccc","ddd"};
     Stream<String> stream6=Stream.of(str);

    }
}
