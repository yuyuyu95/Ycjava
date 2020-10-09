package demo_02;
/*
String当中与转换相关的常用方法

public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes();获得当前字符串底层的字节数组
public String replace(CharSequence,oldString,CharSequence,newString);

 */
public class demo_String05 {
    public static void main(String[] args) {

        //转换成为字符数组
        char[] charArray = "hello world".toCharArray();
        System.out.println(charArray);
        System.out.println(charArray.length);
        System.out.println("============================");


        //转换成为字节数组
        byte[] byteArray = "javaisthebest".getBytes();
        System.out.println(byteArray.toString());
        System.out.println(byteArray.length);
        System.out.println("=============================");


        //字符串的内容替换

        String str1 = "how do you do";
        String str2 = str1.replace('o','i');
        System.out.println(str2);

    }

}
