package Day21Study;

//제네릭
public class PostBox<T> {  //generic class
    private T item;  //자료형이 무엇인지는 PostBox 클래스를 사용하는 시점에 제네릭 클래스의 타입을 지정하여 생성

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
