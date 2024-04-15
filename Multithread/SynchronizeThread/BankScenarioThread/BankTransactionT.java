package Multithread.SynchronizeThread.BankScenarioThread;


public class BankTransactionT implements Runnable {
    private BankAccountT account;
    private boolean isDeposit;
    private double amount;

    public BankTransactionT(BankAccountT account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
