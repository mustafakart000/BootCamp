package JavaSunctruction.practice_bootCamp;

public class Loop03 {
    public static void main(String[] args) {
        String str2 = "mustafa";
        String getStr2 = "";

        for (int i=str2.length() -1; i>-1;i--){
            ;
            String subStr = str2.substring(i, i+1);
            getStr2+=subStr+" ";
        }
        if (getStr2.equals(str2)){
            System.out.println("Palidrom'dur: "+getStr2);
        }else {
            System.out.println("Bu ifade Palidrom değildir = " + getStr2);
        }
    }
}
