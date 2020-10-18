package demo_09;
/*
练习：
    计算一个字符串中每个字符出现次数

分析：
    1.使用Scanner获取用户输入
    2.创建Map集合，key是字符串中的字符，Value是字符的个数
    3.遍历字符串，获取每一个字符
    4.使用获取的字符串，去Map集合判断key是否存在
        key存在：
            通过字符，获取字符个数
            value++
            put(key,value)把新的value存储到Map集合中
        key不存在：
            put(key,1)
    5.遍历集合，输出结果



 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice_字符串 {


    public static void main(String[] args) {

       //1.使用Scanner获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.next();

        //2.创建Map集合，key是字符串中的字符，Value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();


        //  3.遍历字符串，获取每一个字符

        for (Character c:s.toCharArray()) {

            //4.使用获取的字符串，去Map集合判断key是否存在
            //        key存在：
            //            通过字符，获取字符个数
            //            value++
            //            put(key,value)把新的value存储到Map集合中
            //        key不存在：
            //            put(key,1)


            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);

            } else {
                map.put(c, 1);


            }

        }
            // 5.遍历集合，输出结果

            for (Character key :map.keySet()){

                Integer value = map.get(key);

                System.out.println(key+"->"+value);



            }

















    }


}
