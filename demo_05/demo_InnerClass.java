package demo_05;
/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类

分类：
1.成员内部类
2.局部内部类(包含匿名内部类)

成员内部类的定义格式：
修饰符 class 外表类名称{
    修饰符 class 内部类名称{


    }

}


局部内部类的定义格式：
修饰符 class 外部类名称{
    修饰符 返回值类型   外部类方法名称(参数列表){
        class   局部内部类名称{



        }
    }

}


如何使用成员内部类
1.间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
2.直接方式：公式：
外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
注意：内用外，随意访问，外用内，需要内部类对象


定义一个类的时候，权限修饰符的规则
1.外部类：public/(default)
2.成员内部类 ： public/protected/(default)/private
3.局部内部类：什么都不能写

 */
public class demo_InnerClass {
    public static void main(String[] args) {


        Body body = new Body("yuc");    //外部类的对象
        body.methodBody();//通过外部类的对象，调用内部类的方法，里面间接再使用内部类Heart




        Body.Heart heart = new Body("余畅").new Heart();//外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();//
        //等于创建了一个内部类对象

        heart.beat();


        //创建一个外部类对象，让后再调用那个把内部类写在里面的方法
        Outer outer = new Outer();
        outer.methodOuter();








    }




}
