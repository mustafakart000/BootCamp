package İnheritanceTest.İnheratancePolymorphismTest03;

public class test {
    public static void main(String[] args) {
        boolean keepGoing =true;
        int count =0;
        int x=3;
        while (count++<3) {
            System.out.println(count);
            int y =(1+2*count)%3;
            System.out.println("y: "+y);
            switch (y){
                default :
                    System.out.println("y default: "+y);
                case 0: x-=1;
                    System.out.println("y0: "+y);
                    break;

                case 1 : x+=5;System.out.println("y1: "+y);

            }
}
        System.out.println(x);
    }
}
