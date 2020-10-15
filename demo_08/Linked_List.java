package demo_08;

import java.util.LinkedList;

/*
java.util.LinkedList集合 实现类 List接口

LinkedList集合的特点：
    1.底层是一个链表结构：查询慢，增删快
    2.里边包含了大量的操作首尾元素的方法

    public void addFirst(E e):将指定元素插入此列表的开头
    public void addLast(E e):将指定元素添加到此列表的结尾
    public E getFirst(E e):返回此列表的首元素
    public E getLast(E e):返回此列表的尾元素
    public E removeFirst(E e):移除此列表的首元素
    public E removeLast(E e):移除此列表的尾元素
    public E pop():从此列表表示的堆栈处弹出一个元素
    public void push(E e):将元素推入此列表所表示的堆栈
    public boolean isEmpty(E e)：判读此列表是否为空

 */
public class Linked_List {

    public static void main(String[] args) {
        //创建LinkedList对象
        LinkedList<String> stringLinkedList = new LinkedList<>();

        //往列表中添加元素
        stringLinkedList.add("apple");
        stringLinkedList.add("microsoft");
        stringLinkedList.add("google");
        System.out.println(stringLinkedList);

        //public void addFirst(E e):将指定元素插入此列表的开头,此方法等于push方法

        stringLinkedList.addFirst("amazon");
        System.out.println(stringLinkedList);

        //public void addLast(E e):将指定元素添加到此列表的结尾,此方法等于add方法
        stringLinkedList.addLast("netflix");
        System.out.println(stringLinkedList);


        // public E getFirst(E e):返回此列表的首元素

        System.out.println(stringLinkedList.getFirst());

        // public E getLast(E e):返回此列表的尾元素
        System.out.println(stringLinkedList.getLast());

        //public E removeFirst(E e):移除此列表的首元素
        System.out.println(stringLinkedList.removeFirst());




        //public E removeLast(E e):移除此列表的尾元素
        System.out.println(stringLinkedList.removeLast());


        System.out.println(stringLinkedList);

        //  public E pop():从此列表表示的堆栈处弹出一个元素
        System.out.println(stringLinkedList.pop());

        System.out.println(stringLinkedList);

        // public boolean isEmpty(E e)：判读此列表是否为空
        stringLinkedList.clear();
        System.out.println(stringLinkedList.isEmpty());





    }


}
