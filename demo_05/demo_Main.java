package demo_05;

public class demo_Main {
    public static void main(String[] args) {


        Weapon weapon = new Weapon("疾风之刃", 10000);
        Hero hero = new Hero(20, "亚索", weapon);




        hero.attack();


    }






}
