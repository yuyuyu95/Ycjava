package demo;

import java.util.ArrayList;

/*
数组的长度不能改变，但ArrayList的长度可以改变

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全是统一的类型
注意：泛型只能是引用类型，不能是基本类型



ArrayList中常用的方法有

public boolean add(E e) :向集合当中添加元素，参数的类型和泛型一致
public E get(int index):向集合当中获取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
public int size():获取集合的尺寸长度，返回值是集合中所包含的元素个数
 */
public class demo_ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称的list,里面装的全部都是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        //add方法使用
        list.add("小网");
        list.add("小李");
        list.add("小妹");
        list.add("小刚");
        list.add("小余");

        System.out.println(list);

        //size方法使用
        System.out.println(list.size());

        //get方法使用

        System.out.println(list.get(2));

        //remove方法使用

        list.remove(0);
        System.out.println(list);

        //ArrayList的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }






    }

}
