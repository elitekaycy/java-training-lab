package OOP;

public class BankAccount {
    private String accountId;
    private static long accountCounterId = 0;
    private Double accountBalance;

    public BankAccount() {
        this.accountBalance = 0.0;
        this.accountId = String.valueOf(++accountCounterId);
    }
    String getAccountId() { return this.accountId; }
    Double getAccountBalance() { return this.accountBalance; }
    void setAccountId(String accountId) { this.accountId = accountId; }
    void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    void deposit(double amount) {
        this.accountBalance += amount;
    }

    void withdraw(double amount) {
        if(this.accountBalance - amount < 0) {
            throw new IllegalArgumentException("invalid amount to withdraw");
        }

        this.accountBalance -= amount;
    }

    void checkBalance() {
        System.out.println("current balance is " + this.getAccountBalance());
    }

}
