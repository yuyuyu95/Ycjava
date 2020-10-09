package demo;
/*
一个标准的类通常要满足下面四个组成部分：

1.所有的成员变量都要使用privat管基础修饰
2.为每一个成员变量编写一对Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

这样标准的类也叫做Java Bean
快捷方法：Code->Generate

 */
public class 一个标准的学生类 {


    //成员变量
    private String name;
    private int age;


    //Getter和Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //无参数的构造方法
    public 一个标准的学生类() {
    }

    //全参数的构造方法
    public 一个标准的学生类(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
