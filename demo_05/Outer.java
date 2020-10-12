package demo_05;

public class Outer {//外部类


    public void methodOuter(){//外部类方法
      class Inner {//局部内部类
          int num = 10;
          public void methodInner(){
              System.out.println(num);//10
          }


        }



        Inner inner = new Inner();
        inner.methodInner();


    }
}
