package shopping;

public class Product {

    String name;
    String category;
    int price;
    int stock;
    public Product(String name, String category, int price, int stock){

        this.name = name;
        this.category =category;
        this.price=price;
        this.stock=stock;


    }

    public int getPrice() {
        return price;
    }



}
