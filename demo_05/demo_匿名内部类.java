package demo_05;
/*
如果接口的实现类(或者是父类的子类)只需要使用唯一的一次
那么这种情况之下就可以省略掉该类的定义，而改为使用【匿名内部类】


匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){

//覆盖重写所有的抽象方法

}



对格式”new 接口名称() {.......}“进行解析：
1.new 代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{.......}这才是匿名内部类的内容









 */
public class demo_匿名内部类 {


    public static void main(String[] args) {
        Myinterface obj  = new Myinterfaceimpl();//多态的写法
        obj.method();//编译看左边，运行看右边


        //使用匿名类
        Myinterface myinterface = new Myinterface() {//大括号里是一个没有名字的类
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };

        myinterface.method();




    }
}
