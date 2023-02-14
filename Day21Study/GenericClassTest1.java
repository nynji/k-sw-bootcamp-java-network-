package Day21Study;

public class GenericClassTest1 {
    public static void main(String[] args) {
        PostBox<String> postBox1 = new PostBox<>(); //T를 String으로 지정
        PostBox<Integer> postBox2 = new PostBox<>();  //소문자 int 안됨
        postBox1.setItem("소포");
        postBox2.setItem(77);
        System.out.println(postBox1.getItem());
        System.out.println(postBox2.getItem());
    }
}
