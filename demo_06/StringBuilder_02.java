package demo_06;
/*
StringBuilder 和 String 可以相互转换
    String->StringBuilder:可以使用StringBuilder的构造方法
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
    StringBuilder->String；可以使用StringBuilder中的toString方法
        public String toString();将当前StringBuilder对象转换为String对象

 */
public class StringBuilder_02 {

    public static void main(String[] args) {

        //String->StringBuilder
        String str = new String("heool");
        System.out.println("str:" + str);
        //将String变成StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        //往StringBuilder中添加数据

        stringBuilder.append("sdasd00");
        System.out.println("stringBuilder:" + stringBuilder);
        System.out.println("=====================");


        //StringBuilder->String
        String s = stringBuilder.toString();
        System.out.println("s:" + s);


    }

}



