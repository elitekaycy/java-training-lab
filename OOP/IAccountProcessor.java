package OOP;

public interface IAccountProcessor <T>{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
