package demo_06;
/*
 StringBuilder 是字符串缓冲区，可以提高字符串的操作效率(看成一个长度可以变化的字符串)
 底层也是一个数组，但是没有被final修饰，可以改变长度

 java.lang.StringBuilder类：
    构造方法：
        public StringBuilder();构造一个空的StringBuilder容器
        public StringBuilder(String str);构造一个StringBuilder容器，并将字符串添加进去



   成员方法：
        public StringBuilder append(.....):添加任意类型数据的字符串形式，并返回当前对象自身
        参数：
            可以是任意的数据类型




 */
public class StringBuilder_01 {


    public static void main(String[] args) {
        //无参构造
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("bul:"+stringBuilder);

        //有参构造
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        System.out.println("bu2:"+stringBuilder1);

        //创建StringBuilder对象
        StringBuilder stringBuilder2 = new StringBuilder();

        //使用append方法往StringBuilder中添加数据

        System.out.println(  stringBuilder2.append("adasd"));


    }


}
