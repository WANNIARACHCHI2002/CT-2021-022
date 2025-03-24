package Q_10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.##");

        double loanAmount;
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double totalPayment;

        int loanPeriod;
        int numberOfPayments;

        System.out.print("input loan amount:");
        loanAmount = s.nextDouble();

        System.out.print("input annual interest rate:");
        annualInterestRate = s.nextDouble();

        System.out.print("input loan period in months:");
        loanPeriod = s.nextInt();

        monthlyInterestRate=(annualInterestRate/100)/12;
        numberOfPayments=loanPeriod;
        monthlyPayment=(loanAmount*monthlyInterestRate)/(1-Math.pow((1/(1+monthlyInterestRate)),numberOfPayments));
        totalPayment=monthlyPayment*numberOfPayments;

        System.out.print("Monthly Payment:"+df.format(monthlyPayment));
        System.out.print("Total Payment after"+loanPeriod+"months:"+ df.format(totalPayment));
    }

}
