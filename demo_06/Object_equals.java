package demo_06;

public class Object_equals {

    /*
    Person继承了Object类，所以可以使用Object类的equals方法
    boolean equals(Object obj)指示其他某个对象是否与此对象相等


    Object类equals方法的源码：
        public boolean equals(Object obj){


        return(this==obj);
    }
    参数：Object可以传递任何的对象
    方法体：this是谁？那个对象调用的方法，方法中的this就是那个对象的。
    == 比较引用类型时比较的时地址值




Object的equals方法默认比较的是两个对象的地址值，没有意义，
所以文明需要重写方法，比较两个对象的属性值



     */


    public static void main(String[] args) {
        Person p1  = new Person("小鱼",18);
        Person p2 = new Person("小王",18);

        System.out.println(p1.equals(p2));//地址值不一样，所以返回False


        p1 = p2;//把p2的地址值赋给p1

        System.out.println(p1.equals(p2));//地址值一样，所以返回True

        //调用重写后的方法


        Person p3 = new Person("小李",18);
        Person p4 = new Person("小李",18);

        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p3.equals(p4));
        /*
        地址值不一样，但成员变量的值一样，在调用了经过重写的equals方法后判断了成员变量的值，返回了true
         */



    }
}
