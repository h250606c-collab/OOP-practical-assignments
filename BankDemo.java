import java.util.*;

public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 100, 50));
        accounts.add(new CurrentAccount("C001", 100, 200));

        double[] withdrawals = {60, 250};

        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);

            System.out.println("\nAccount: " + account.accountNumber);
            account.withdraw(withdrawals[i]);
            account.endOfMonth();

            System.out.printf("Final balance: $%.2f%n",
                              account.getBalance());
        }
    }
}