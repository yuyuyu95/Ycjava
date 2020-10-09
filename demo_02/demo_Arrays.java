package demo_02;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作

public static String toString(数组);将参数数组变成字符串(按照默认格式：[元素1，元素2，元素3....])


public static void sort(数组)：按照默认升序(从小到大)对数组的元素进行排序



 */
public class demo_Arrays {


    public static void main(String[] args) {
        int []intArray = {10,12,13,848,48,4};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);


        int []intSort = {55,87,0,895,5232,59,5};
        Arrays.sort(intSort);
        System.out.println(Arrays.toString(intSort));







    }
}
