package chooseCorrectCombination;




import java.util.*;

public class ChooseCombination {

    public ChooseCombination() {
    }
    Boolean enterIf=false;
    List<String> localLine =new ArrayList<>();

    public Boolean getEnterIf() {
        return enterIf;
    }

    public List<String> getLocalLine() {
        return localLine;
    }

    /* public static void main(String[] args) {
                    Double[] keys = {86.4, 101.4, 205.4};
                    Integer[] values = { 20, 15,5};
                    TreeMap<Double, Integer> dimAndCount=new TreeMap<>();
                    Double orderKey=0.d;
                    String line= "395.0 - + 86.4 x 3.0 + 101.4 x 6.0 + 205.4 x 2.0 + (CT) 1.8 = 0.0";
                    ChooseCombination chooseCombination = new ChooseCombination();
                    chooseCombination.chooseComb(line, keys, values, dimAndCount,orderKey);


                }*/
    public void chooseComb(String  line, TreeMap<Double, Integer> dimAndCount,Double orderKey){

            compare(line, dimAndCount, orderKey);

    }
    public void compare(String line, TreeMap<Double,Integer> dimAndCount,Double orderKey ){


        TakeBetweenTwoPlus twoPlus= new TakeBetweenTwoPlus();
        Double[] plusDimOrd =  twoPlus.makeGroupOrder(line);

            for (int i = 0; i < plusDimOrd.length; i += 2) {
                if (Objects.equals(orderKey, plusDimOrd[i])) {
                    leastOrder(line, plusDimOrd, dimAndCount);

                    break;
                }

            }


        }





    public void leastOrder(String line, Double[] plusDimOrd, TreeMap<Double, Integer> dimAndCount ) {

        enterIf=false;

        Integer min = Integer.MAX_VALUE;
        for (int i = 1; i < plusDimOrd.length; i += 2) {
            if (dimAndCount.get(plusDimOrd[i-1])==0){

                return;


            }
            else if (min > dimAndCount.get(plusDimOrd[i-1])) {
                min = dimAndCount.get(plusDimOrd[i-1])/plusDimOrd[i].intValue();
            }
        }



        for (Map.Entry<Double, Integer> entry : dimAndCount.entrySet()) {
                Double key = entry.getKey();
                Integer value = entry.getValue();
                int rem;
            enterIf=false;
            for (int i = 1; i < plusDimOrd.length; i += 2) {
                    if ( Objects.equals(key, plusDimOrd[i - 1]) && (dimAndCount.get(plusDimOrd[i-1]) - min) > -1) {


                        rem=value - min;
                        if (rem==0){
                            enterIf=true;
                        }else {
                            enterIf=false;
                            break;
                        }


                    }
                }
            if (enterIf){
                for (int i = 1; i <plusDimOrd.length ; i+=2) {

                    dimAndCount.put(plusDimOrd[i-1],  (dimAndCount.get(plusDimOrd[i-1]) - min));
                }
                localLine.add( min + " x " + line);

                System.out.println(localLine);
            }

        }



        }













}
