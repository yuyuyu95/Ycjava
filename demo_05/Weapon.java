package demo_05;

public class Weapon {

    private     String    weapon_Nanem;
    private double weapon_price;

    public Weapon() {
    }

    public Weapon(String weapon_Nanem, double weapon_price) {
        this.weapon_Nanem = weapon_Nanem;
        this.weapon_price = weapon_price;
    }


    public String getWeapon_Nanem() {
        return weapon_Nanem;
    }

    public void setWeapon_Nanem(String weapon_Nanem) {
        this.weapon_Nanem = weapon_Nanem;
    }

    public double getWeapon_price() {
        return weapon_price;
    }

    public void setWeapon_price(double weapon_price) {
        this.weapon_price = weapon_price;
    }



}
