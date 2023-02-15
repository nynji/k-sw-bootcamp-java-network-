package Day21Study;

class Soldier implements Comparable{
    String name;
    String grade;

    public Soldier(String name, String grade) {  //생성자 생성 (Constructor)
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {  //Comparable이 내장클래스이므로 반환형 int는 바꿀 수 없다
        Soldier s = (Soldier)o;
        return grade.equals(s.grade) ? 1 :0;  // 계급이 같으면 1, 다르면 0 리턴
    }
}
public class GenericMethodTest3 {
    public static <T extends Comparable> int countSoldier(T[] arr, T a){
        int count = 0;
        for(T ar : arr)
            if(ar.compareTo(a) == 1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Soldier[] s = { new Soldier("박민석", "일병"), new Soldier("성윤모", "이병"),
                new Soldier("차병호", "이병"), new Soldier("김상훈", "상병"),
                new Soldier("최일구", "병장")};
        System.out.println("분대에 이병 인원은 "
                + countSoldier(s, new Soldier("김아무개", "상병")) + "명 입니다.");


    }
}
