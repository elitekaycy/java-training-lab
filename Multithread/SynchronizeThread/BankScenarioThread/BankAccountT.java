package Multithread.SynchronizeThread.BankScenarioThread;

public class BankAccountT {
    private double balance;
    public BankAccountT(double balance) {
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        System.out.println("depositing amount");
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdraw successfull");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
