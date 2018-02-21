import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getAccountbalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public double getinterestEarned() {
        return accountNumber;
    }

    public void setInterestedEarnd(final double newInterestedEarnd) {
        this.interestEarned = newInterestedEarnd;
    }



    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        setOwnerName(name);
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}