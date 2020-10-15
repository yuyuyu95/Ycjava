package demo_08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
哈希值:是一个十进制整数，由系统随机给出，是逻辑地址，不是物理地址


 */
public class hash_Value {
    //person类继承了Object类，所以它可以使用父类的hashCode方法
    public static void main(String[] args) {


        Person p1 = new Person();

        System.out.println(p1.hashCode());

        Person p2 =new Person();
        System.out.println(p2.hashCode());


    }
}
