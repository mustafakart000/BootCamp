
import java.util.List;
import java.util.Objects;

public class SameNumber {


    public void removeSameNumber(List<Double> valueList, List<Double> valueListAndCount, List<Double> multiplyValueAndAmount) {
        int count=0;
        for (int i =count ; i < valueList.size(); i++) {

            int ifCount =0;
            for (int j =count+1; j < valueList.size(); j++) {

                count++; ifCount++;
                if (!Objects.equals(valueList.get(count-1), valueList.get(count))) {

                    break;
                }

            }

            if ( ifCount> 3) {
                for (int k =count-1  ; k >count-(Math.ceil(ifCount+1))/2; k--) {
                    valueList.remove(k);
                    valueListAndCount.remove(k);
                    multiplyValueAndAmount.remove(k);
                }
            }else if ( ifCount==3){

                    valueList.remove(count-1);
                    valueListAndCount.remove(count-1);
                    multiplyValueAndAmount.remove(count-1);

            }
            count++;
        }
    }




}
