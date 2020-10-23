package demo_10;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
        try....catch ：异常处理的第二中方式，自己处理异常
        格式:
            try{
            可能产生异常的代码
            }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
                异常的处理逻辑，怎么处理异常对象


            }
            ...
            catch(异常类名，变量名){


            }


注意：
    1.try中可能会产生多个异常，那么就可以使用多个catch来处理这些对象
    2.如果try中产生了异常，那么就会执行catch中的异常的处理逻辑，执行完毕的catch中的处理逻辑，继续执行try...catch之后的代码
      如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try..catch之后的代码



 */
public class try_catch {




    public static void main(String[] args) {


        try {
            find_doc("c:\\a.jpg");
        } catch (IOException e) {
            System.out.println("catch --> 文件后缀名异常");
        }
        System.out.println("后续代码");

           /*

         String toString()
          返回此 throwable 的简短描述。

           String getMessage()
          返回此 throwable 的详细消息字符串。


        void printStackTrace()
          将此 throwable 及其追踪输出至标准错误流。
         */






    }











    /*
    定义一个方法，对传递文件的路径进行合法性判断
    如果路径不是"c:\\a.txt"，那么我们就抛出文件找不到异常对象，告知调用者
     */

    public  static  void  find_doc(String fileName) throws IOException {



        //如果文件的结尾格式不是.txt，
        if (!fileName.endsWith(".txt"));{

            throw  new IOException("文件后缀异常");


        }












    }






}
