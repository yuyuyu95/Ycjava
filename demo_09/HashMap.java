package demo_09;

import java.util.Map;

/*
        java.util.Map<k,v>集合
        Map集合的特点：
            1.Map集合是一个双列集合，一个元素包含两个值(一个key,一个value)
            2.Map集合中的元素,key和value的数据类型可以相同，也可以不同
            3.Map集合中的元素,key是不允许重复的，value是可以重复的
            4.Map集合中的元素，key和value是一一对应的

        java.util.HashMap<k,v>集合， implements Map<k,v>接口
        HashMap集合的特点：
            1.HashMap集合底层是哈希表：查询的速度特别快
            2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致

       java.util.LinkedHashMap<k,v> 集合 extends HashMap<k,v>集合
       LinkedHashMap的特点：
            1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
            2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的

            


 */
public class HashMap {
    public static void main(String[] args) {


            show03();



    }

    private static void show03() {

        /*
            public V get(Object key)根据指定的值，在Map集合中获取对应的值
                返回值：
                    key存在，返回对应的key值
                    key不存在，返回null




         */
    Map<String,String> map = new java.util.HashMap<>();
    map.put("google","American");
    map.put("alibaba","China");
    map.put("softbank","Japan");
    map.put("samsung","Korean");


        String google = map.get("google");//得到Google所对应的value
        System.out.println(google);


    }

    private static void show02() {
        /*
        public V remove (Object key):把指定的值所对应的元素在Map集合中删除，返回被删除的元素的值
            返回值:V
                key存在，V返回被删除的值
                key不存在，V返回null
         */
        Map<String,Integer>map = new java.util.HashMap<>();
        map.put("james",36);
        map.put("curry",31);
        map.put("ingram",22);

        System.out.println(map);

        Integer curry = map.remove("curry");//返回的值是31
        System.out.println(curry);
        System.out.println(map);


    }

    private static void show01(){
        /*
    public V put(K key,V value):把指定集合的键与添加到Map集合中。
       返回值：V
           存储键值对的时候，key不重复，返回值V是null
           存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值


     */

        //创建map集合对象，使用多态写法
        Map<String,String> map = new java.util.HashMap<>();
        String v1 = map.put("curry","warriors");
        System.out.println(v1);//null

        String v2 = map.put("curry","lakers");//key值重复了，要替换value值
        System.out.println(v2);//返回的是被替换的value值warriors






    }






}
