import banking.Account;
import banking.Loan;

public class Q3 {
    public static void main(String[] args) {
        Account myAccount = new Account("123456789", 10000);
        myAccount.deposit(5000);

        System.out.println();

        Loan myLoan = new Loan("L98765", 250000);
        myLoan.sanctionLoan();
    }
}
