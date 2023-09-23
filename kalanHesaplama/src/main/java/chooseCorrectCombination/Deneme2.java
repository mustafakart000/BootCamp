package chooseCorrectCombination;

public class Deneme2 {
    public static void main(String[] args) {
        TakeBetweenTwoPlus tk= new TakeBetweenTwoPlus();
        String numbers="595.0 - + 40.0 x 1.0 + 80.0 x 1.0 + 125.4 x 1.0 + 244.8 x 1.0 + 101.4 x 1.0 + (CT) 3.4 = 5.0";
        System.out.println(tk.ctNum(numbers));

    }
}
