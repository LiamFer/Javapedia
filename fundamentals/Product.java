package fundamentals;

public class Product <T,U>{
    private T item;
    private U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    T getItem(){
        return this.item;
    }

    U getPrice(){
        return this.price;
    }

    void checkProduct(){
        System.out.println(getItem() + " costs $" + getPrice());
    }
}
