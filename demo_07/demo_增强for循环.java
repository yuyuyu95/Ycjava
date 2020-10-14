package demo_07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/*
增强for循环：for each

格式
    for(集合/数组的数据类型 变量名：集合名/数组的名字){

        sout(变量名)

    }
 */
public class demo_增强for循环 {

    public static void main(String[] args) {

        xunHuan_01();
        xunHuan_02();

    }

    //使用增强for循环遍历数组
    public  static void xunHuan_01(){
        int []arr = {45,48,44,6};
        for (int i:arr){
            System.out.println(i);
        }
    }


    //使用增强for循环遍历集合
    public static  void xunHuan_02() {
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("apple");
        arrayList.add("google");
        arrayList.add("microsoft");
        arrayList.add("amazon");

        for (String s:arrayList){

            System.out.println(s);

        }



            }

}
