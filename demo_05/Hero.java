package demo_05;
/*
类当中的成员变量可以用自定义的类的类型
类当中的成员变量可以使用接口来充当
 */
public class Hero {


    private   int age;
    private   String name;
    private  Weapon weapon;

    public Hero() {

    }


    public Hero(int age, String name, Weapon weapon) {
        this.age = age;
        this.name = name;
        this.weapon = weapon;
    }


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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }




    public void attack(){
        System.out.println("名字为"+name+"的英雄"+"手持价值"+weapon.getWeapon_price()+"金的"+weapon.getWeapon_Nanem()+"正在攻击敌方！");
    }








}
