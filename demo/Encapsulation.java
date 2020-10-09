package demo;
/*
面向对象三大特性：封装，继承，多态

封装性在Java中的体现：
1.方法就是一种封装
2关键字private也是一种封装
3.封装就是将一些细节信息隐藏起来。对于外界不可见

 */
public class Encapsulation {
        public static void main(String[] args){
            int[] array = new int[10];
            array = inIt(array,array.length);

            int max = getMax(array);
            System.out.println("最大值"+max);

        }

        //随机初始化数组,体现方法的封装性
        public static int[] inIt (int []array,int length){
            for (int i = 0; i < array.length; i++) {
                array[i] =(int)(Math.random()*100);
            }
                return array;
        }


        //给我一个数组，我还你一个最大值，体现方法的封装性
        public static int  getMax(int []array){
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i]>max)
                {
                    max = array[i];
                }
            }
            return max;
        }

}
