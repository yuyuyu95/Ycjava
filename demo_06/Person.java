package demo_06;

import java.util.Objects;

public class Person {


    private String name;
    private int age;

    public Person() {


    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    直接打印对象的地址没有意义，需要重写Object类的toString方法
    打印对象的属性
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    直接打印对象的地址没有意义，需要重写Object类的toString方法
    打印对象的属性


    问题：隐含着一个多态
    Object obj = p2 = newPerson("小鱼",18);
    多态弊端;无法使用子类特有的内容(属性，方法)
    解决：可以使用向下转型(强转)把Object类型转化成Person类型
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }






}

