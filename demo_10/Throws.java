package demo_10;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字:异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理，最终交给JVM处理
    使用格式：
        修饰符 返回值类型 方法名(参数列表 throws AAAExceptions,BBBExceptions...{
            throw new AAAException("产生原因");
            throw new BBBException("产生原因")

            .....


        }


        注意：
            1.throws关键字必须写在方法声明处
            2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
            3.方法内部如果抛出了多个异常对象，那么throws后面必须也声明多个异常
            4.调用了一个声明抛出异常的方法，我们就必须处理异常



 */
public class Throws {


    public static void main(String[] args) throws IOException {


        find_doc("c:\\a.txt");
        find_doc("c:\\a.jpg");




    }


    /*
    定义一个方法，对传递文件的路径进行合法性判断
    如果路径不是"c:\\a.txt"，那么我们就抛出文件找不到异常对象，告知调用者
     */

    public  static  void  find_doc(String fileName) throws IOException {

        //如果路径不是"c:\\a.txt"，则抛出文件找不到异常
        if (!fileName.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("文件找不到异常");//文件找不到异常是编译异常，需要自己处理

        }

        //如果文件的结尾格式不是.txt，
        if (!fileName.endsWith(".txt"));{

            throw  new IOException("文件后缀异常");


        }







    }


}
