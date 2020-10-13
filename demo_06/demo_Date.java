package demo_06;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/*
java.util.Date:表示时间和日期的类


把日期转换为毫秒;
    当前的日期：2088-01-01
    时间原点(0毫秒):197年1月1日00：00：00
    就是计算当前日期到时间原点之间一共经历了多少毫秒
 */
public class demo_Date {


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到时间原点一共经历了多少毫秒


        //空参构造方法
        Date date1 = new Date();
        System.out.println(date1);//打印的是系统当前时间，是英文输出

        //有参构造方法
        Date date2 =new Date(3000L);
        System.out.println(date2.toLocaleString());//格式化输出


        //创建日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(date2);
        System.out.println(format);

        //获取日历对象
        Calendar c = Calendar.getInstance();

        //get方法

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println("==================");
        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        System.out.println("==================");


        //set方法

        c.set(Calendar.YEAR,2077);//将年份设置成2077
        year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println("===================");



        //add方法

        c.add(Calendar.YEAR,2);//将年份加上2
        year =c.get(Calendar.YEAR);
        System.out.println(year );












    }

}

