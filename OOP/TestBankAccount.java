package OOP;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount();

        AccountProcessor<BankAccount> processSavingsAccount = new AccountProcessor<>(bankAccount);
        processSavingsAccount.deposit(50);

        bankAccount.checkBalance();
    }
}
