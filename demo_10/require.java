package demo_10;
/*
Objects类中有一个requireNonNull方法来检测对象是否为空
 */

import java.util.Objects;

public class require {

    public static void main(String[] args) {
        method(null);



    }


    public  static  void  method(Object obj){

        Objects.requireNonNull(obj,"对象为空");

    }
}
