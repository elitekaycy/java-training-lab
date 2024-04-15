package OOP;

public class AccountProcessor <T extends BankAccount> implements IAccountProcessor<BankAccount> {

    private T account;

    public AccountProcessor(T account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        this.account.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        this.account.withdraw(amount);
    }

    @Override
    public void checkBalance() {
        this.account.checkBalance();
    }

}
