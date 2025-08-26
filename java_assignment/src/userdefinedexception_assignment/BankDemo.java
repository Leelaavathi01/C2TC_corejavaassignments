package userdefinedexception_assignment;

public class BankDemo {
    public static void main(String[] args) {
        // Create a bank account with initial balance
        BankAccount account = new BankAccount(101, 5000);

        // Display initial balance
        account.displayBalance();

        // Deposit operations
        try {
            account.deposit(2000);   // Valid deposit
            account.deposit(-500);   // Invalid deposit
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            System.out.println("Deposit attempt finished.\n");
        }

        // Withdrawal operations
        try {
            account.withdraw(3000);  // Valid withdrawal
            account.withdraw(7000);  // Invalid withdrawal (exceeds balance)
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal attempt finished.\n");
        }

        // Final balance
        account.displayBalance();
    }
}
