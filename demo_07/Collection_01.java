package demo_07;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection接口
    所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

    共性的方法;
 public boolean add(E e);给给定的对象添加到集合当中
 public void    clean();清空集合中所有的元素
 public boolean remove(E e);把给定的对象在当前集合中删除
 public boolean contains(E e);判断当前集合中是否包含指定的对象
 public boolean isEmpty();判断当前结合是否为空
 public int size();返回集合中元素的个数
 public Object[] toArray();把集合中的元素，存储到数组中



 */
public class Collection_01 {

    public static void main(String[] args) {

        //创建一个集合对象

        Collection<String> collection = new ArrayList<>();//多态写法
        System.out.println(collection);//重写了toString方法
        collection.add("余畅");
        System.out.println(collection);//集合中存储了一个元素
        collection.add("站三");
        collection.add("里斯");
        collection.add("川普");
        collection.add("李哥");


        System.out.println(  collection.remove("余畅"));//有余畅这个元素，返回真
        System.out.println(collection.remove("的撒"));//没有的撒这个元素，返回假

        System.out.println(collection);

        System.out.println(collection.contains("川普"));//有川普这个元素，返回真
        System.out.println(collection.contains("郭靖"));//没有郭靖这个元素，返回假


        System.out.println(collection.isEmpty());//判断集合是否为空

        System.out.println(collection.size());//返回集合中元素的个数

        Object[] toArray = collection.toArray();

        for (int i = 0; i < toArray.length; i++) {
            System.out.println(toArray[i]);
        }



        collection.clear();//删除集合中的所有元素

        System.out.println(collection.isEmpty());


    }
}
