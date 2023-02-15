import Diablo.Axe;
import Diablo.Barbarian;
import Diablo.Bow;
import Diablo.Sorceress;
// import Diablo.*; //Diablo 패키지의 모든 것들을 import

public class Day23 {
    //Diablo v0.2

    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();  //객체 생성 -> 생성자 돌아가면서 hp, mp 할당됨
        Bow windForce = new Bow();
        Axe berserkerAxe = new Axe();
        b1.setWeapon(berserkerAxe);  // 주워서
        s1.setWeapon(windForce);
        s1.performWeapon();
        b1.performWeapon();  // 사용(동작)
        s1.setWeapon(new Axe());
        s1.performWeapon();
        s1.info();
        b1.setWeapon(()-> System.out.println("신오브로 아이스볼을 발사~"));
        b1.performWeapon();
    }
}
