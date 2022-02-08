import java.util.Scanner;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years as an integer for your loan duration: ");
        int numOfYears = input.nextInt();

        System.out.print("Enter loan amount that you are taking, for example, 120000.50: ");
        double loanAmount = input.nextDouble();

        Loan loan01 = new Loan(annualInterestRate, numOfYears, loanAmount);
        System.out.println("The loan was created on " + loan01.getLoanDate());
        System.out.println("The monthly payment is " + df.format(loan01.getMonthlyPayment()));
        System.out.println("The total payment is " + df.format(loan01.getTotalPayment()));
    }
}
