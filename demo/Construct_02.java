package demo;

public class Construct_02 {
    public static void main(String[] args) {

        Construct person1 = new Construct();//无参数的构造方法

        Construct person2 = new Construct("余畅",19);//全参数的构造方法其方便在实例化一个对象时直接将属性写入对象中

        //如果还需改变对象成员变量中的数据内容，任然要使用setXxx方法
        System.out.println(person2.getAge());
        System.out.println(person2.getName());









    }
}
