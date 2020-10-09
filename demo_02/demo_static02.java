package demo_02;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用。
成员变量：类名称.静态变量
成员方法：类名称.静态方法()


注意：静态不能访问非静态
     静态方法中不能写this
 */

public class demo_static02 {
    public static void main(String[] args) {

    }
}
