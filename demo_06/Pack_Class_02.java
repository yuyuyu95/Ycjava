package demo_06;
/*
    基本类型与字符串之间的转换
    基本类型--->字符串
        1.基本数据类型的值+“”  最简单的方式
        2.使用包装类中的静态方法
            static String toString(int i) 返回一个表示指定整数的String对象
        3.使用String类中的静态方法
            static String valueOf(int i) 返回int参数的字符串表示

     字符串--->基本类型
        使用包装类的静态方法parseXX("字符串")
            Integer类 ： static int parseInt(String s)
            Double类  ： static double parseDouble(String s)
            ......
 */
public class Pack_Class_02 {

    public static void main(String[] args) {


        //基本类型-->字符串
        String string = 100 + "";
        System.out.println(string+200);


        String string1 = Integer.toString(100);
        System.out.println(string1+200);


        String string2 = String.valueOf(100);
        System.out.println(string2+200);



        //字符串-->基本类型

        int i = Integer.parseInt("1215");
        System.out.println(i+200);

        double v = Double.parseDouble("0.454848");
        System.out.println(v+200);

        float v1 = Float.parseFloat("0.25454545454");
        System.out.println(v1+200);


    }
}
