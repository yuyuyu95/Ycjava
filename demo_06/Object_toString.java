package demo_06;
/*
java.lang.Object类
类 Object 是类层次结构的根(最顶层)类。每个类都使用Object作为父类
所有对象(包括数组)都实现这个类的方法
 */
public class Object_toString {

    public static void main(String[] args) {

    /*
    Person类默认继承了Object类，所以可以使用Object类中的toString方法
    String toString() 返回该对象的字符串表示

     */


        Person person = new Person("张三",18);
        String s = person.toString();
        //System.out.println(s);//demo_06.Person@1540e19d

        //打印对象名其实就是调用对象的toString方法，需要对此方法进行重写


        System.out.println(s);

        /*
        看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
            如果没有重写toString方法,那么打印的就是对象的地址值(默认)
            如果重写了toString方法，那么就按照重写的方式打印
         */





    }




}
