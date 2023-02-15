package Day21Study;

public class GenericMethodTest1 {
    //배열 속 원소가 어떤 타입이어도 순회하며 출력하는 프로그램
    static class Prints{
        public static <T> void printArray(T[] arr){  // 타입 매개변수 T
            for(T a : arr)
                System.out.println(a);
        }

        public static <T> T getFirst(T[] arr){
            return arr[0];
        }

        public static void main(String[] args) {
            Double[] d1 = {3.14, 2.71, 9.9};
            Integer[] i1 = {1, 24, 33};
            Character[] c1 = {'A', 'C', 'E'};
//            String[] s1 = {'Hi', 'Hello'};
            System.out.println(Prints.getFirst(c1));
            Prints.printArray(d1);
            Prints.printArray(i1);
            // Number 클래스의 자식 클래스로 제한해서 문자, 문자열은 사용 불가
//            Prints.printArray(c1);
//            Prints.printArray(s1);
        }
    }
}
