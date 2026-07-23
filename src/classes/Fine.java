package classes;

import java.util.ArrayList;
import java.util.List;

public class Fine {

    private List<Violation> violations;
    private String plateNumber;



    public Fine(){};

    public Fine(String plateNumber , List<Violation> violations) {
        this.violations = violations;
        this.plateNumber = plateNumber;
    }
    public int getTotalAmount() {
        int totalAmount = 0;

        for (Violation violation : violations) {
            totalAmount += violation.getFineAmount();
        }
        return totalAmount;
    }


    @Override
    public String toString() {
        String result = "Traffic fine for car " + plateNumber + "\n\n";
        result += "Total amount: " + getTotalAmount() + " EGP\n\n";
        result += "Violations:\n";

        for (Violation violation : violations) {
            result += "- " + violation.getDescription()
                    + " : "
                    + violation.getFineAmount()
                    + " EGP\n";
        }

        return result;
    }
}
