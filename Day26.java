public class Day26 {
    private String secret = "Day26의 캡슐화된 변수";  // 캡슐화
    String s = "Day26의 인스턴스 변수";

    class MemberClass {
        String s = "Day 26의 MemberClass의 인스턴스 변수";

        public void show1() {
            System.out.println("Inner Class ");
            System.out.println(secret); // 비공개 (MemberClass안에 secret 변수가 존재하지 않아 바깥 스코프의 secret 변수 값을 출력)
            System.out.println(s);  // 내부 (MemberClass 안에 s 변수가 존재)
            System.out.println(Day26.this.s); // 외부 (Day26의 인스턴스 변수 s의 값을 출력)
        }

        // static String s3 = "정적 멤버 필드";
        // static void show2() {}
    }

    public static void main(String[] args) {
        // MemberClass mc = new MemberClass(); //바깥쪽 객체 선언이 선행되지 않으면 불가능
        Day26 m = new Day26();
        Day26.MemberClass mc = m.new MemberClass();

        System.out.println(mc.s);
        mc.show1();
//        mc.s3 = "test";
//        System.out.println(Day26.MemberClass.s3);
//        Day26.MemberClass.info();
    }
}

