package demo_07;
/*
泛型的通配符：
    ?:代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class demo_泛型的通配符 {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList =new ArrayList<>();
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);


        ArrayList<String>arrayList1 = new ArrayList<>();
        arrayList1.add("apple");
        arrayList1.add("microsoft");
        arrayList1.add("google");
        arrayList1.add("amazon");


        printArray(arrayList);
        System.out.println("===============================");
        printArray(arrayList1);



    }




        /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符？来接收数据
         */
        public  static  void printArray(ArrayList<?> list){

            //使用迭代器遍历集合

            Iterator<?> iterator = list.iterator();
            while (iterator.hasNext()){
                Object next = iterator.next();
                System.out.println(next);
            }


        }

}
