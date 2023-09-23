package maybeUseThemInTheFuture;

public class deneme2 {
    public static void main(String[] args) {
        String st= " + HasanAli x mehmet + kemal x dursun + ";
        System.out.println(st.substring(0,3));
        int plus = st.indexOf("+");
        int x =st.indexOf(" x");
        String a= st.substring(plus+1, x).trim();
        System.out.println(a);
    }
}
