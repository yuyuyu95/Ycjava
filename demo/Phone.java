package demo;



/*
手机的成员变量：品牌，颜色，价格
成员方法：打电话，发短信
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void Call(String someone){
        System.out.println("给"+someone+"打电话");

    }

    public void Text(){
        System.out.println("群发短信");
    }




}

