package demo_02;
/*
java.util.Math 类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的工作

public static double abs(double num);获取绝对值
public static double ceil(double num);向上取整
public static double floor(double num);向下取整
public static long round(double num);四舍五入


 */
public class demo_math {
    public static void main(String[] args) {


        //获取绝对值
        System.out.println(Math.abs(-3.184));

        //向上取整
        System.out.println(Math.ceil(3.1));

        //向下取整
        System.out.println(Math.floor(3.9999));

        //四舍五入
        System.out.println(Math.round(3.4999));
        System.out.println(Math.round(3.5));




    }






}



