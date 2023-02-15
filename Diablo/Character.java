package Diablo;

public abstract class Character {
    protected int hp;
    protected int mp;
    // ...
    WeaponBehavior weapon; // Association (Aggregation)

    //public abstract void info(); //자식 클래스에서 오버라이드 하면 됨
    public void info(){
        System.out.println("체력 : " + hp + "\n지능 : " + mp);
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public final void performWeapon(){
        weapon.useWeapon();
    }
}
