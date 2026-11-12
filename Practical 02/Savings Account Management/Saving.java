public class SavingsAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //Getter and Setter for Account Number
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Getters and Setters for Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //Getter for balance
    public double getBalance() {
        return balance;
    }

    //Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

            System.out.println("Deposited " + amount + " --- New balance: " + balance);
        }
    }
    //Withdraw Money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;

            System.out.println("Withdraw " + amount + " --- New balance: " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display final account details
    public void displayAccountDetails() {
        System.out.println("\nFinal Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Acound Holder: " + accountHolderName);
        System.out.println("Blance: " + balance);
    }
}
