package demo_04;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。
如何定义一个接口的格式：
public interface 接口名称{
}

如果是Java 7,那么接口中可以包含的内容有：
1.常量
2.抽象方法
如果是Java 8,那么接口中可以额外包含的内容有：
3.默认方法
4.静态方法



接口使用步骤

1.接口不能直接使用，必须有一个“实现类”来“实现”该接口,该“实现类”必须重写接口中的所有抽象方法
实现：去掉abstract关键字，加上大括号方法体
3.创建实现类的对象，进行使用

注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类


接口当中也可以定义”成员变量“，但是必须使用public static final 三个修饰符修饰
从效果上来看，这其实激素接口的常量

public static final 数据类型 常量名称 = 数据值


 */
public class demo_Interface {

    public static void main(String[] args) {




        //错误写法！不能直接new接口对象使用
        // MyinterfaceAbstract inter = new MyinterfaceAbstract() ;


        //创建实现类的对象使用
        MyinterfaceAbstractimpl impl = new MyinterfaceAbstractimpl();


        impl.method();

        MyinterfaceDefaultA impla = new MyinterfaceDefaultA();
        MyinterfaceDefaultB implb = new MyinterfaceDefaultB();
        impla.methodabs();
        impla.methodDefault();//调用默认方法，如果实现类当中没有，会向上找接口
        implb.methodabs();
        implb.methodDefault();//调用默认方法，如果实现类当中没有，会向上找接口


        MyinterfaceStaticimpl implC = new MyinterfaceStaticimpl();
        //implC.methodStatic();//错误写法，不能通过接口的实现类来调用接口当中的静态方法


        //通过接口名称，直接调用其中的静态方法

        MyinterfaceStatic.methodStatic();

        //通过实现类来调用接口的常量
        int numOfMyClass = impl.NUM_OF_MY_CLASS;
        System.out.println(numOfMyClass);
        //也可通过接口名称来调用接口的常量
        System.out.println(MyinterfaceAbstract.NUM_OF_MY_CLASS);



    }




}










