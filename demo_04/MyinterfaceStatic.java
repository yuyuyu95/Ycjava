package demo_04;
/*
从Java 8开始，允许定义静态方法
格式：
public static 返回值类型 方法名称 (参数列表){

    方法体
}

注意：不能通过接口的实现类的对象来调用接口当中的静态方法
正确方法：通过接口名称，直接调用其中的静态方法

 */
public interface MyinterfaceStatic {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法");


        }
}
