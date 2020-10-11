package demo_04;
/*
在任何版本的Java中，接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称(参数列表);

注意事项：
1.接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2.这两个关键字修饰符，可以选择性的忽略
3.方法的三要素，可以随意定义




 */
public interface MyinterfaceAbstract {

    //这其实是一个常量，一旦赋值，不可修改
    public static final int NUM_OF_MY_CLASS = 10;

    public abstract void method();//定义抽象方法



}
