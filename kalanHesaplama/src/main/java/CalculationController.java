//import chooseCorrectCombination.TakeFile;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import storage.DataDTO;
//import storage.Pieces;
//
//@RestController
//@RequestMapping("/api")
//public class CalculationController {
//    @PostMapping("/calculate")
//    public void calculate(@RequestBody DataDTO data) {
//        double[] jsorderDimensions = data.getOrderDimensions();
//        int[] jsquantities = data.getQuantities();
//        int[] jsmaterialDimensions = data.getMaterialDimensions();
//        Pieces pieces = new Pieces(jsorderDimensions,jsquantities,jsmaterialDimensions);
//
//
//        CalculateGroupAsDimensions calculateGroupAsDimensions = new CalculateGroupAsDimensions();
//        CollectSortedCombinationIntoList coll = new CollectSortedCombinationIntoList();
//
//
//
//        calculateGroupAsDimensions.designIndexes();
//        coll.readCollectionValues();
//        SortTextFileByExpression sf = new SortTextFileByExpression();
//        String file = "collectAllFiles";
//        sf.bufferRead(file);
//        TotalSameOrder totalSameOrder = new TotalSameOrder();
////      totalSameOrder.bufferReadSameNumber(file2);
//        totalSameOrder.bufferRead(file);
//        TakeFile tk= new TakeFile();
//        String file3 = "newComSameOrder";
//        tk.bufferReader(file3);
//    }
//
//
//}
//
