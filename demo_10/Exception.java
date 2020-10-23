package demo_10;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

java.lang.Throwable类是Java语言中所有错误和异常的父类
        Exception：编译期异常，进行编译(写代码)Java程序出现的问题
            RuntimeException :运行期异常，Java程序运行中出现的问题
        Error：错误
            错误就相当于程序得了一个不治之症，需要修改源代码程序才能继续执行


 */
public class Exception {
    public static void main(String[] args)  {//throws ParseException    //将异常抛出，交给虚拟机处理


        //Exception：编译期异常，进行编译(写代码)Java程序出现的问题
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");//格式化日期\
        Date date = null;
        try {
             date = simpleDateFormat.parse("1990-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
        System.out.println("程序继续执行");


    }
}
