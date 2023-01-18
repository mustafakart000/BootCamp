package Order;

import java.util.ArrayList;
import java.util.List;

public class CreateOrder <T>  {
    List<T>  createorder = new ArrayList<>();

     T first;
     T second;
     T third;
     T fourth;
     T fifth;

    public CreateOrder( T first, T second, T third, T fourth, T fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst() {

        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond() {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getFourth() {
        return fourth;
    }

    public void setFourth(T fourth) {
        this.fourth = fourth;
    }

    public T getFifth() {
        return fifth;
    }

    public void setFifth(T fifth) {
        this.fifth = fifth;
    }

    public T calcu(T first,T second,T third){


        return third;
    }
    public Integer divide(Integer first, Integer second){

        Integer a;
        a=first*second;
        return a;
    }
}
