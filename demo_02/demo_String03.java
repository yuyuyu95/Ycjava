package demo_02;
/*
String 当中与获取相关的常用方法有：

public int length();获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index);获取指定索引位置的单个字符(索引从零开始)
public int indexOf(String str);查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值


 */
public class demo_String03 {

    public static void main(String[] args) {

        //获取字符串的长度
        String str1 ="sdadasdadasdasd";
        System.out.println(str1.length());


        //拼接字符串
        String str2 = "hello";//还是hello
        String str3 = "world";//还是world
        String str4 = str2.concat(str3);//一个全新的字符串



        //获取指定索引位置的单个字符
        char ch = "we are the champion".charAt(6);
        System.out.println("在6号索引位置的字符是"+ch);


        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果没有，返回-1
        String original = "hello";
        int index = original.indexOf("llo");
        System.out.println(index);








    }



}
