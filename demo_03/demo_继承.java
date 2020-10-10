package demo_03;

import java.sql.SQLOutput;

/*
继承主要解决的问题：公性抽取
继承关系的特点
1.子类可以拥有父类的“内容”
2.子类还可以拥有自己专有的内容


在继承的关系中，“子类就是一个父类”，也就是说，子类可以被当作父类看待



在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量
    等号左边是谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量
    该方法属于谁，就优先用谁，没有则向上找




当局部变量，成员变量，父类成员变量都重名时
局部变量        直接写成员变量名
成员变量        this.成员变量名
父类的成员变量   super.成员变量名



在父子类的继承关系当中，创建子类对象，访问成员方法的规则
    创建的对象是谁，就优先用谁，如果没有则向上找

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找，绝对不会向下找子类的



重写(Override)
概念：在继承关系中，方法的名称一样，参数列表也一样，也称为覆盖
1.必须保证父子类的方法的名称相同，参数列表也要一样
2.@Override：写在方法前面，用来检测覆盖是否正确
3.子类方法的返回值必须要小于等于父类方法的返回值范围
java.lang.Object类是所有公共类的最高父类(祖宗类)
4.子类方法的权限修饰符必须大于等于父类方法的
public>protected>不写>private



继承关系中，父子类构造方法的特点
1.子类构造方法中有一个默认隐含的”super()调用“，所以一定是先调用的父类构造，后执行的子类构造







定义父类的格式 (一个普通的类定义) ：
public class 类名称{

}

定义子类的格式：
public class 子类名称 extend 父类名称{


}
 */
public class demo_继承 {


    public static void main(String[] args) {
        Teacher t = new Teacher();//实例化一个讲师对象
        t.method();//其继承了Employee的方法

        System.out.println(t.num);//优先子类,3

        t.methodfu();//方法定义在父类中，所以是1




    }









}
