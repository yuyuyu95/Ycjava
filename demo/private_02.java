package demo;

public class private_02 {

    public static void main(String[] args){
     private_ person = new private_();

        //普通成员变量，可以赋值
        person.name = "余畅" ;


        //person.age = -100;//访问的是带private的关键字，被拒绝

        person.setAge(100);
        int age = person.getAge();
        System.out.println(age);











    }



}
