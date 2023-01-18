package Day01.Generics;

public class GenericTypeTwoParameter <S,U> {
    private S s;
    private U u;
    //Consturctor

    public GenericTypeTwoParameter(S s, U u) {
        this.s = s;
        this.u = u;
    }

    //Getter-Setter
    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
//Main method
    public static void main(String[] args) {
        GenericTypeTwoParameter<String, Integer> obj1=new GenericTypeTwoParameter<>("mustafa",1);
        GenericTypeTwoParameter<Integer, String> obj2=new GenericTypeTwoParameter<>(2,"Kart");
        System.out.println(obj1.getS());
        System.out.println(obj1.getU());

    }
}
