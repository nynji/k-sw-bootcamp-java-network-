//package Day21Study;
//
//class Dp<K, V>{
//    private K name;
//    private V grade;
//
//    public Dp(K name, V grade) {
//        this.name = name;
//        this.grade = grade;
//    }
//
//    public K getName() {
//        return name;
//    }
//
//    public V getGrade() {
//        return grade;
//    }
//}  //타입을 유연하게 쓸 수 있다
//public class GenericClassTest2 {
//    public static void main(String[] args) {
//        Dp<String, String> s1 = new Dp<>("한호열", "상병"); // 매개변수를 갖는 생성자가 존재하므로 초기값 넣어주기
//        Dp<String, Integer> s2 = new Dp<>("한호열", 3);
//
//        Dp<PostBox, String> s4 = new Dp<>(P, 5); //사용자 정의 클래스(PostBox)도 들어갈 수 있다
//
//
//        System.out.println(s1.getName() + "의 계급은 " + s1.getGrade() + "입니다");
//        System.out.println(s2.getName() + "의 계급은 " + s2.getGrade() + "입니다");
//    }
//}
