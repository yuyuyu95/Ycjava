package demo_07;

import java.util.ArrayList;
import java.util.Iterator;

public class deno_泛型 {

    /*
    创建集合对象不使用泛型
    好处：
        集合不使用泛型，默认的类型就是Object类，可以存储任意数据
    弊端：
        不安全，会引发异常


     */


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();//没用使用泛型，所以集合里可以存储任意的类型
        arrayList.add("fa");
        arrayList.add(155);
        arrayList.add('s');

        //用迭代器遍历集合
        Iterator iterator = arrayList.iterator();


        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);

        }






        /*
        集合对象使用泛型：
        好处：
            1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
            2.把运行期异常提升到了编译期异常
         弊端：
            泛型是什么类型，集合里就只能存储什么类型

         */

        ArrayList<String>arrayList1 = new ArrayList<>();//使用泛型创建一个集合
        arrayList1.add("48");
        arrayList1.add("sad");
        arrayList1.add("curry");
        arrayList1.add("sda");


        //使用迭代器遍历集合
        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()){
            String s = iterator1.next();
            System.out.println(s+"->"+s.length());//可以使用String自己特有的功能




        }

    }




}
