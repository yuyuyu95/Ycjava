package demo_03;
/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类，必须是抽象类才行，在class之前加上abstract即可


如何使用抽象类和抽象方法
1.不能直接创建抽象类对象
2.必须用一个子类来继承抽象父类
3.子类必须覆盖重写抽象父类当中所有的抽象方法
覆盖重写(实现)：子类去掉抽象方法的abstract关键字，然后补上大括号的内容





 */
public abstract class demo_Animal {
        //这是一个抽象方法，代表吃东西，但不知道具体吃什么？
        public abstract void eat();


        //这是普通方法
        public void normalMethod(){

        }
}
