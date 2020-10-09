package demo_02;
/*
java.lang.String类代表字符串
API当中说：Java程序中所有的字符串面值，如（“ABC”）都作为此类的实例实现
其实就是说：程序当中所有的双引号字符串，都是String类的对象    （就算没有new，也照样是String的对象）

字符串的特点
1.字符串是常量它的值不能变
2.正是因为字符串不可改变，所有字符串是可以共享使用的
3.字符串效果上是char[]字符数组，但是底层原理是byte[]字节数组


创建字符串的3+1种方式：
public String();//创建一个空白字符串，不含有任何内容
public String(char[] array)//根据字符数组的内容，来创建对应的字符串
public String(byte[] array)//根据字节数组的内容，来创建对应的字符串

一种直接创建：
String str ="hello";//右边直接双引号


字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
对于基本类型来说 == 是进行数值上的比较
对于引用类型来说 == 是进行地址值的比较


 */






public class demo_String {

    public static void main(String[] args) {


        String str = new String();//括号为空，表示字符串的内容为空
        System.out.println("字符串的内容是"+str);




        //使用字符数组来创建字符串

        char[] charArray ={'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("字符串的内容是"+str2);



        //使用字节数组来创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("字符串的内容是"+str3);







    }



}
