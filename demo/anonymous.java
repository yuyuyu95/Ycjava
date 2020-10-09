package demo;
/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new类名称();

匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象
使用建议：如果确定有一个对象只使用唯一的一次，就可以用匿名对象
 */
public class anonymous {
    public static void main(String[] args) {
        new Student().name="余畅";//创建了一个匿名对象,并将他的成员变量name设置为余畅
        new Student().show();//并不会打印”我的名字叫余畅“,因为new了一个新的对象，还没赋值


    }


}
