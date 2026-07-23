package classes;

import interfaces.Rule;

public class Violation {

    private String description;
    private int fineAmount;

    public Violation(String description, int fineAmount) {
        this.description = description;
        this.fineAmount = fineAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "description='" + description + '\'' +
                ", fineAmount=" + fineAmount +
                '}';
    }
}
