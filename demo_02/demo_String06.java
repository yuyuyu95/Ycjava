package demo_02;
/*
字符串的分割方法
public String[] split(String regex);按照参数的规则，将字符串切分为若干部分

 */
public class demo_String06 {
    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }







    }
}
