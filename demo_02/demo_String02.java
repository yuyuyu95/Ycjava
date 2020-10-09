package demo_02;
/*
对字符串内容进行比较

public boolean equals(Object obj) 参数可以说任何对象，只有参数是一个字符并且内容相同的才会给true,否则返回false
equals具有对称性
建议常量放在变量前 如"abc".equals(str)//防止空指针异常
 */
public class demo_String02 {

    public static void main(String[] args) {


        String str1 = "hello";
        String str2 = "hello";

        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        String str3 = new String(charArray);


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equals(str3));


    }


}
