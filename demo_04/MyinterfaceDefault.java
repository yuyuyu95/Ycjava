package demo_04;
/*
从Java 8开始，接口里允许定义默认方法
格式：
public default 返回值类型 方法名称(参数列表){
        方法体
}
备注：接口当中的默认方法，可以解决接口升级的问题

接口的默认方法可以被实现类直接调用
接口的默认方法可以被实现类覆盖重写

 */
public interface MyinterfaceDefault {


    public abstract void methodabs();//抽象方法定义
    //public abstract void methodabs2();//新添加一个抽象方法
    //新添加的方法改为默认方法就能解决两个实现类没有全部重写抽象方法的问题
    public default void methodDefault()
    {
        System.out.println("这是新的默认方法");
    }

}
