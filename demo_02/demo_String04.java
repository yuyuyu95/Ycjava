package demo_02;
/*
字符串的截取方法

public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
public String substring (int begin, int end);截取从begin开始，一直到end结束，中间的字符串
备注，左闭右开区间[begin,end)

 */
public class demo_String04 {
    public static void main(String[] args) {
        String str1 ="Hello world";
        String str2 = str1.substring(6);
        System.out.println(str2);
        String str3 = str1.substring(1,6);
        System.out.println(str3);


    }
}
