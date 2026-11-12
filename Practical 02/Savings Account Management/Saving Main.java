import java.util.Scanner;

public class SavingsAccountMain {
    public static void main(String[] args) {
        //Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //Create SavingAccount Object
        SavingsAccount account = new SavingsAccount();

        //Get account number from user
        System.out.print("Enter Account Number: ");
        account.setAccountNumber(input.nextLine());

        //Get Account Holder Name
        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolderName(input.nextLine());

        //Enter Initial Deposit
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = input.nextDouble();
        //Add initial deposit
        account.deposit(initialDeposit);

        //Enter another Deposit
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        //Deposit Money
        account.deposit(depositAmount);

        //Enter Withdrawal Amount
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = input.nextDouble();
        //Withdraw Money
        account.withdraw(withdrawAmount);

        //Display Final Amount Details
        account.displayAccountDetails();
    }
}
