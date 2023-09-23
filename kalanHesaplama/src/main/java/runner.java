
import chooseCorrectCombination.GetCombFromTxt;
import chooseCorrectCombination.TakeFile;

public class runner {
    public static void main(String[] args) {


        CalculateGroupAsDimensions calculateGroupAsDimensions = new CalculateGroupAsDimensions();
        CollectSortedCombinationIntoList coll = new CollectSortedCombinationIntoList();



        calculateGroupAsDimensions.designIndexes();
        coll.readCollectionValues();
        SortTextFileByExpression sf = new SortTextFileByExpression();
        String file = "collectAllFiles";
        sf.bufferRead(file);
        TotalSameOrder totalSameOrder = new TotalSameOrder();
//      totalSameOrder.bufferReadSameNumber(file2);
        totalSameOrder.bufferRead(file);
        TakeFile tk= new TakeFile();
        String file3 = "newComSameOrder";
         tk.bufferReader(file3);
        String file4="SortCuttingThickness";
        GetCombFromTxt getCombFromTxt = new GetCombFromTxt();
        getCombFromTxt.getCombFromTxt(file4);

    }

}
