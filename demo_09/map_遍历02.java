package demo_09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历的第二种方式：使用Entry对象遍历

Map集合中的方法;
    Set<Map.Entry<K,V>> entrySet() 返回此映射包含的映射关系的Set视图

实现步骤：
    1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
    2.遍历Set集合，获取每一个Entry对象
    3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class map_遍历02 {
    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("Tesla","musk");
        map.put("Apple","cook");
        map.put("Amazon","bezos");
        map.put("Alibaba","jackMa");

        //1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //2.遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
           //3.使用Entry对象中的方法getKey()和getValue()获取键与值

            Map.Entry<String, String> next = iterator.next();
            System.out.println("key:\t"+next.getKey()+"\tvalue:\t"+next.getValue());

        }


    }
}
