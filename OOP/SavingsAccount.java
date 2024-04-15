package OOP;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    double getInterestRate() { return this.interestRate; }
    void setInterestRate(double interestRate) { this.interestRate =  interestRate; }

    void addInterest(double interest) {
        double percentageInterest = interest * 100;
        this.setInterestRate(percentageInterest);
    }

}
