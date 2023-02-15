public class Day23 {
    //Diablo v0.2

    public static void main(String[] args) {
        Sorceress s1 = new Sorceress();  //객체 생성 -> 생성자 돌아가면서 hp, mp 할당됨
        Bow windForce = new Bow();
        s1.setWeapon(windForce);
        s1.performWeapon();
    }
}
