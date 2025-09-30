package banking;

public class Loan {
    private String loanId;
    private double loanAmount;

    public Loan(String loanId, double loanAmount) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
    }

    public void sanctionLoan() {
        System.out.println("Loan " + loanId + " for amount " + loanAmount + " has been sanctioned.");
    }
}
