import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("총 마리의 포켓몬이 생성되었습니다");
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            String menu = sc.nextLine();
            if (menu.equals("2")){
                System.out.println("프로그램을 종료합니다");
                break;
            }else if(menu.equals("1")){
                    // pass
            }else{
                System.out.println("메뉴에서 골라 주세요");
            }
        }

        // day14 포켓몬스터 v0.5 자바 버전 작업 중
    }
}
