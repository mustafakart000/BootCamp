package JavaSunctruction.day29abstractioncollections;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        //(oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar
//Biz istersek siralamayi belirleyebiliriz

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue);
    }
}
