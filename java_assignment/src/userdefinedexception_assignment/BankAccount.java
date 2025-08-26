package userdefinedexception_assignment;

public class BankAccount {
    private int accountNumber;   // Account number
    private double balance;      // Current balance

    // Parameterized constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposit money into the account.
     * @param amount - deposit amount
     * @throws InvalidAmountException if deposit amount <= 0
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    /**
     * Withdraw money from the account.
     * @param amount - withdrawal amount
     * @throws InvalidAmountException if amount <= 0
     * @throws InsufficientFundsException if withdrawal exceeds balance
     */
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Current Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
    }

    /**
     * Display the current balance.
     */
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: " + balance);
    }
}