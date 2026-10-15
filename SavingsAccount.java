public class SavingsAccount extends Account {
    private final double minimumBalance;
    private final double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance,
                          double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
        } else if (balance - amount < minimumBalance) {
            System.out.println("Savings withdrawal rejected: minimum balance is $"
                    + minimumBalance);
        } else {
            balance -= amount;
            System.out.println("Savings withdrawal successful: $" + amount);
        }
    }

    @Override
    public void endOfMonth() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings interest added: $" + interest);
    }
}