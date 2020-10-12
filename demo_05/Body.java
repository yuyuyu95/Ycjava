package demo_05;

public class Body {//外部类


    public  class Heart{//成员内部类


        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+name);//正确写法，说明内部类可以访问外部类的成员变量

        }
    }

    //外部类的成员变量
    private String name;


    public Body() {


    }


    public Body(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();//在外部类的方法中创建一个匿名变量以此来调用内部类的方法
    }




}




