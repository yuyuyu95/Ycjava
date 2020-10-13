package demo_06;
/*
装箱:把基本类型的数据，包装到包装类当中(基本类型的数据->包装类)
    构造方法：
        Integer(int value)构造一个新分配的Integer对象，它表示指定的int值
        Integer(String s)构造一个新分配的Integer对象，它表示String参数所指示的int值
        传递的字符串，必须是基本类型的字符串，否则会抛出异常“100” 正确 “a”抛异常

     静态方法：
         static Integer valueOf(int i)；返回一个表示指定的int值的Integer实例
         static Integer valueOf(String s) 返回保存指示的String 的值的Integer对象
         
         
拆箱：在包装类中取出基本类型的数据(包装类->基本类型的数据  )
        成员方法：
          int  intValue()以int类型返回该Integer的值



自动装箱和自动拆箱：基本数据类型的数据和包装类之间可以自动的相互转换





*/

public class Pack_Class {

    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类当中(基本类型的数据->包装类)
        //构造方法
        Integer integer = new Integer(1);
        System.out.println(integer);

        Integer integer1 = new Integer("1");
        System.out.println(integer1);

        //静态方法
        Integer integer2 = Integer.valueOf(1);
        System.out.println(integer2);

        Integer integer3 = new Integer("1");
        System.out.println(integer3);


        //拆箱：在包装类中取出基本数据类型的数据(包装类->基本类型的数据)
        int i = integer.intValue();
        System.out.println(i);




        /*
        自动装箱：直接把int类型的整数赋值给包装类
        Integer integer4 = 1; 就相当与Integer integer4 = new Integer(1);
         */
        Integer integer4 = 1;
        /*
        自动拆箱：integer4是包装类，无法直接参与运算，可以自动切换为基本数据类型的数据，再参与计算
        integer4+2 就相当于integer4.intValue()+3=3
        integer4 = integer4+2; 就相当于integer4 = new Integer(4)自动装箱

         */

        integer4 = integer4+2;

        System.out.println(integer4);


    }


}
