package demo;
/*
构造方法是专门用来创建对象的方法，当我们通过new关键字来创建对象时，其实就是在调用构造方法

格式：
public 类名称(参数类型 参数名称)
{
        方法体


}

注意事项：
1.构造方法的名称必须和所在的类名称完全一致，就连大小写也要一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会赠送一个构造方法，没有参数，方法体什么也不做
public Construct(){}

5.构造方法可以重载
6.一下代码是一个标准的学生类


 */
public class Construct {
    //成员变量
    int age ;
    String name;


    //无参数的构造方法
    public Construct(){
        System.out.println("无参构造方法执行了");//简单的构造方法

    }


    //全参数的构造方法
    public Construct(String name , int age){//复杂的构造方法
        System.out.println("全参构造方法执行了");
        this.age = age;
        this.name = name;

    }

    //Getter和Setter方法
    public void setName(){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge(){
        return age;

    }





}
