package demo;
/*
定义person的年龄是无法阻止不合理的数值被设置进来
解决方案：用private关键字将需要保护的变量进行修饰

一旦使用的privat进行修饰，那么本类当中仍然可以随意访问，
但是！超出了本类范围之外的就不能够再直接访问了



间接访问private成员变量，就需要定义一对儿Getter/Setter方法
必须叫setXxx或者是getXxx命名规则
对于Getter来说，不能有参数，返回值类型和成员变量对应；
对于Setter来说，不能有返回值，参数类型和成员变量对应；



 */
public class private_ {

    String name;
    private int age;

    public void show() {
        System.out.println("我叫" + name + ",年龄" + age);


    }
    //此方法，专门向age设置数据
    public void setAge(int num) {
        if(num>120||num<0){
            System.out.println("非法年龄");
        }
        else {
            age = num;
        }



    }

    //此方法，专门用于获取age的值
    public int getAge(){
        return age;
    }

}