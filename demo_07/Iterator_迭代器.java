package demo_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Java.util.Iterator接口：迭代器(对集合进行遍历)
有俩个常用的方法
    boolean hasNext()
          如果仍有元素可以迭代，则返回 true,判断结合中还有没有下一个元素。
    E next()
          ，取出集合的 下一个元素。
    void remove() 移除迭代器返回的最后一个元素



Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
Collection接口中有一个方法，叫Iterator(),这个方法返回的就是迭代器的实现类对象


迭代器的使用步骤(重点)
1.使用集合中的Iterator()方法获取迭代器的实现类对象，使用Iterator接口接收(多态)
2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
3.使用Iterator接口中的方法next()取出集合的下一个元素


 */
public class Iterator_迭代器 {


    public static void main(String[] args) {
        Collection<String> collection =new ArrayList();//用多态创建一个集合对象

        //往集合中添加元素


        collection.add("james");
        collection.add("kobe");
        collection.add("jordan");
        collection.add("curry");
        collection.add("durant");

//多态    接口                              实现类对象
        Iterator<String>stringIterator = collection.iterator();


        //使用hasNext判断集合中还有没有下一个元素

        boolean b = stringIterator.hasNext();

        //使用next取出集合中的下一个元素

        String s = stringIterator.next();

        System.out.println(s);//james



/*
发现 使用迭代器取出集合中元素的代码，是一个重复的过程，所以可以使用循环来优化
不知道循环的次数，使用while循环

 */
        while (stringIterator.hasNext()){

            String e = stringIterator.next();
            System.out.println(e);


        }





    }




}
