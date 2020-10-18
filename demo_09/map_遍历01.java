package demo_09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合的第一种遍历方式:通过键找值的方式
Map集合中的方法：
    Set<K> keySet() 返回此映射中包含的键的Set视图
实现步骤：
    1.使用Map集合中的方法keySet(),把Map集合中所有的key取出来，存储到一个Set集合中
    2.遍历Set集合，获取方法Map集合中的每一个key
    3.通过Map集合中的方法get(key)，通过key找到value

 */
public class map_遍历01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Tesla","musk");
        map.put("Apple","cook");
        map.put("Amazon","bezos");
        map.put("Alibaba","jackMa");

        //利用keySet方法将Map集合中的键变成Set集合
        Set<String> keySet = map.keySet();
        //使用增强for循环遍历Set集合
        for (String s:keySet){
           String s1 = s;
           String s2 = map.get(s);
            System.out.println("key:"+s1+"\tvalue:\t"+s2);

        }




    }




}
