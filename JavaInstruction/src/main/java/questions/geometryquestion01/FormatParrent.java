package questions.geometryquestion01;

import java.text.DecimalFormat;

public class FormatParrent {
    void displayNumber(double c) {
        DecimalFormat format = new DecimalFormat("###,##0.00");
        System.out.println(format.format(c));
    }
}