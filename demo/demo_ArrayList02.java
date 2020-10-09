package demo;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的“包装类”

基本类型        包装类(引用类型，包装类都位于java.lang包下)
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean



 */
public class demo_ArrayList02 {
    public static void main(String[] args) {
        //ArrayList<int>list1 = new ArrayList<>();错误写法，泛型只能是引用类型，不能是基本类型

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);


        System.out.println(list1);

        int num = list1.get(0);
        System.out.println(num
        );


    }
}
