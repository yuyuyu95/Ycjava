package demo_02;
/*
一但用了static关键字，那么这样的内容不再属于对象自己，而是属于类的，
所以凡是本类的对象，都共享同一份数据



 */
public class demo_static {

    public static void main(String[] args) {


        demo_Student one = new demo_Student(18, "郭文贵");
        demo_Student two = new demo_Student(88, "班农");


        demo_Student.room = "301教室";//静态内容推荐使用类名称来调用
        System.out.println("姓名:"+one.getName()+" 年龄:"+one.getAge()+" 教室:"+one.room);


        System.out.println("姓名:"+two.getName()+" 年龄:"+two.getAge()+" 教室:"+two.room);

    }


}
