package demo_08;
/*
可变参数：jdk1.5之后出现的新特性
使用前提：
    当方法的参数列表数据类型已经确定，但参数的个数不确定，就可以使用可变参数
使用格式：定义方法时使用
    修饰符 返回值类型 方法名(数据类型...变量名){
    }


可变参数的注意事项：
    1.一个方法的参数列表，只能由一个可变参数
    2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

 */
public class Changeable_arguement {

    public static void main(String[] args) {


        System.out.println(add(1,4,84,2,1,48,32,65,9,59,5));


    }





    //计算0到n个整数的和
    public  static  int   add(int...arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return  sum;

    }



}
