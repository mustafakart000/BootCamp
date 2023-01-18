package shopping;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    String name;
    int age;

    List<Order> orderList = new ArrayList<>();


    public Customer(String name, int age){
        this.name =name;
        this.age =age;
    }


    public void addOrder(Order ord){
        if(ord==null) System.out.println("Invalid Order");
        else orderList.add(ord);
        System.out.println("order added");
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "name= "+ name + "age= "+age+ "orderList= "+orderList;
    }

}
