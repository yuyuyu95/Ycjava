package demo_02;

public class demo_Student {
    private  int age;
    private String name;
    static  String room;//所在的教室


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public demo_Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public demo_Student() {
    }
}
