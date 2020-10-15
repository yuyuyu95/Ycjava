package demo_08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
java.util.Collections 是集合工具类，用来对集合进行操作，部分方法如下
    public static <E> boolean addAll(Collections<E> C,T...elements);往集合中添加一些元素
    public static void shuffle(List<?> List)打乱集合顺序
    public static <E> void sort(List<E> List)将集合中的元素按照默认规则排序
    sort(List<E> List)使用前提：
        被排序的集合里面存储的元素，必须实现Comparable，重写接口中的compareTo来定义排序规则

Comparator和Comparable的区别：
    Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
    Comparator：相当于找一个第三方裁判，比较两个集合

 */
public class Collections_方法 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        Collections.addAll(list,"apple","google","amazon","microsoft");
        System.out.println(list);

        //打乱集合中元素的顺序
        Collections.shuffle(list);
        System.out.println(list);


        //按默认顺序排序
        Collections.sort(list);
        System.out.println(list);



        ArrayList<Integer>integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        Collections.sort(integerArrayList, new Comparator<Integer>() {
            @Override//重写比较的规则
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序
                return  o2-o1;//降序
            }
        });

        System.out.println(integerArrayList);









    }
}
