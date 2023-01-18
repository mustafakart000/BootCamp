package Order;

import java.util.List;

public class Runner {


    public static void main(String[] args) {
        CreateOrder<Integer> createOrder= new CreateOrder<>(1,2,3,4,5);

        System.out.println(createOrder.divide(createOrder.first, createOrder.second));


    }

}
