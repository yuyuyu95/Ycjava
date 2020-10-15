package demo_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.List 接口   extends Collections接口
List接口的特点:
    1.有序的集合，存储元素和取出元素的顺序是一样的(存储123，取出123)
    2.有索引，包含了一些带索引的方法
    3.可以存储重复的元素

    List接口中带索引的方法
        public void add (int index,E element);将指定的元素，添加到该集合中的指定位置上
        public E get(int index);返回集合中指定位置的元素
        public E remove(int index);移除列表中指定位置的元素，返回的是被移除的元素
        public E set(int index,E element);用指定元素替换集合中指定位置的元素，返回值的更新前的元素

    注意：
        操作索引的时候，一定要防止越界异常

 */
public class List_01 {

    public static void main(String[] args) {

        //创建一个List对象，多态
        List<String>stringList = new ArrayList<>();//左借口，右实现类，这是多态写法

        stringList.add("apple");
        stringList.add("google");
        stringList.add("netflix");

        System.out.println(stringList);//是按存储的顺序输出，说明是按存储的顺序取出的元素



        //将指定的元素，添加到该集合中的指定位置上
        stringList.add(1,"microsoft");

        System.out.println(stringList);//将"microsoft"添加在集合的索引值为1的位置上



        //返回集合中指定位置的元素
        System.out.println(stringList.get(3));



        //移除列表中指定位置的元素，返回的是被移除的元素
        System.out.println(stringList.remove(0));//"apple"被删除
        System.out.println(stringList);


        //用指定元素替换集合中指定位置的元素，返回值的更新前的元素


        stringList.set(1,"facebook");//将索引值为1的元素替换成"facebook"

        System.out.println(stringList);


        System.out.println("================================");
        //List集合的遍历方式有三种

        //使用普通的for循环
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("================================");

        //使用迭代器来遍历
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("================================");

        //使用增强for循环来遍历

        for (String s:stringList){
            System.out.println(s);
        }


    }



}
