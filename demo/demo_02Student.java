package demo;
import demo.Student;//导包语句 import 包名称.类名称（对于和当前类属于同一个包的情况，可以省略导包语句不写）
/*创建格式：
类名称 对象名 =new 类名称（）；
Student stu = new Student();

使用，分为两种情况：

使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
(也就是说，想用谁，就用对象名点谁)

注意事项：
如果成员变量没用被赋值，将会有一个默认值，其规则与数组一样

 */


public class demo_02Student {
   public static void main(String[] args){
       Student stu = new Student();//实例化学生类


       System.out.println(stu.name);//0
       System.out.println(stu.age);//null

       System.out.println("==========================");

       stu.age = 18;
       stu.name = "余畅";

       System.out.println(stu.name);
       System.out.println(stu.age);




   }

}
