package demo_08;

import java.util.HashMap;
import java.util.HashSet;

/*
HashSet存储自定义类型元素
set集合元素唯一：
    要重写equals和hashCode方法

要求：
    同名同年龄的人，视为同一个人，只能存储一次
 */
public class Set_02 {
    public static void main(String[] args) {


        HashSet<Student> studentHashSet = new HashSet<>();
        Student student =new Student("james",36);
        Student student1 =new Student("james",36);
        Student student2 =new Student("james",35);

        studentHashSet.add(student);
        studentHashSet.add(student1);
        studentHashSet.add(student2);


        System.out.println(studentHashSet);//因为重写了equals和hashCode方法，所以没有将student和student1当作2个人





    }



}
