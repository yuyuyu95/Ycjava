package demo_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set接口 extends Collections接口

Set接口的特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历


java.util.HashSet集合 实现了 Set接口
HashSet特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    4.底层是一个哈希表结构(查询的速度非常快)




 */
public class Set_01 {
    public static void main(String[] args) {


        Set<Integer> integerSet = new HashSet<>();//多态写法创建集合
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);

        //没有索引，所以不能使用普通的for循环，要使用迭代器

        Iterator<Integer> iterator = integerSet.iterator();//创建迭代器

        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }






    }


}
