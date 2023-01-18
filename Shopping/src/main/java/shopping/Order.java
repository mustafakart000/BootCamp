package shopping;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final int orderNum;
    List<Product> productList = new ArrayList<>();
    int orderPrice =totalPrice();

    @Override
    public String toString() {
        return
                ", orderNum=" + orderNum +
                ", ordePrice=" + orderPrice;
    }
    public Order(int orderNum, Product p){
        this.orderNum = orderNum;
        addProduct(p);
    }

    public void addProduct(Product p){
        if(p==null) System.out.println("Invalid product");
        else productList.add(p);
        System.out.println("Product added");
        orderPrice = totalPrice();
    }

    private int totalPrice(){
        int tp =0;
        for (Product p: productList){
            tp+=p.getPrice();
        }
        return tp;
    }

    public int getOrderPrice(){
        return orderPrice;
    }
    public int getOrderNum(){
        return orderNum;
    }
}
