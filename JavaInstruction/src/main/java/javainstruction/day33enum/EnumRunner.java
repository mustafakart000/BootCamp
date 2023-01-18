package javainstruction.day33enum;

public class EnumRunner {
    public static void main(String[] args) {
      String capital =  UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);
        String abbr=UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);

        /*public static String getStateNameFromAbbrevation(String abbreviation){

        }*/
    }
}
