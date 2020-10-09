package demo;
//实例化一个手机类的对象
public class demo_02Phone {
    public static void main(String[] args){

        Phone x = new Phone();

        x.brand = "apple";
        x.color="white";
        x.price=10000;

        System.out.println(x.brand);
        System.out.println(x.color);
        System.out.println(x.price);


        x.Call("老妈");
        x.Text();



    }






}
