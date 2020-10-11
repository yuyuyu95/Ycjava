package demo_04;
/*
代码中体现多态性，其实就是一句话：父类引用指向子类对象

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();

成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边



 */
public class demo_Multi {


    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        demo_Fu obj = new demo_Zi();
        obj.method();//调用的是子类当中的方法
        obj.methdoFu();//调用的是父类特有方法


        System.out.println(obj.num);//调用的是父类的成员变量，优先查找等号左边的类


    }






}
