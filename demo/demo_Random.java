package demo;
/*
Random用来生成随机数字

1.导包：
    import java.util.Random;
2.创建：
    Random r = new Random();//小括号当中是空的
3.使用：
    获取一个随机的int数字：int num = r.nextInt();
    获取一个随机的int数字(参数代表了范围，左闭右开区间)：int num = r.nextInt(3)
    实际上代表了0到2之间的随机数


 */
import java.util.Random;//导包

public class demo_Random {


    public static void main(String[] args) {
        Random r1 = new Random();


        int num1 = r1.nextInt();

        System.out.println("随机数是"+num1);


        int num2 = r1.nextInt(12);

        System.out.println("随机数是"+num2);



    }
}
