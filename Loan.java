import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    java.util.Date loanDate = new java.util.Date();

    public double monthlyPayment;

    //default constructor with default values
    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    // other methods
    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 12;
        double compoundedInterest = Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12);
        this.monthlyPayment = (this.loanAmount * monthlyInterestRate )/ (1 - (1 / compoundedInterest));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return this.monthlyPayment * this.numberOfYears * 12;
    }

    // getters and setters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

}
