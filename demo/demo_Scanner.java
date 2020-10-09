package demo;
/*import 包路径.类名称;
如果需要使用的目标类，与当前类位于同一个包下，则可以省略导包语句不写
只有Java.lang包下的内容不需要导包



2.创建
类名称 对象名 = new 类名称();



3.使用
对象名.成员方法()

获取键盘的一个int数字：int num = sc.nextInt();
获取键盘的一个字符串：String str = sc.next();



 */

import java.util.Scanner;

public class demo_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in代表从键盘输入


        int num = sc.nextInt();
        System.out.println(num);



        String str  = sc.next();
        System.out.println(str);

    }
}
