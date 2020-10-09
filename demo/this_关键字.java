package demo;
/*
当方法的局部变量和类中的成员变量重名时，根据就近原则，会优先使用局部变量
如果需要访问本类中的成员变量，需要使用格式：
this.成员变量名

"通过谁调用的方法，谁就是this"
 */
public class this_关键字 {
    String name; //我自己的名字

    //参数name是对方的名字
    //成员变量name是自己的名字

    public  void sayHello(String name ){
        System.out.println(name + "你好我是"+this.name);
    }

}
