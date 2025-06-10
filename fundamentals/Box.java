package fundamentals;

public class Box<T> {
    private T item;

    Box(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    void unbox(){
        System.out.println("The content of thix box is: " + getItem());
    }
}
