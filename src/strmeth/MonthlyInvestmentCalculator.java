package strmeth;
import java.util.Scanner;

public class MonthlyInvestmentCalculator {
    public static void main(String[] args) {
        // Input values
//      double oneTimeContribution = 100000;
//      double annualGrowthRate = 12;
//      double monthlyContribution = 1000;
//      int investmentPeriodMonths = 60; // 5 years
    	
    	
    	
    	 int investmentPeriodYears = 0;
    	 
    	//int investmentPeriodYears =	 investmentPeriodYears*12;
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("oneTimeContribution");
    	double oneTimeContribution = sc.nextDouble();
    	
    	System.out.println("monthlyContribution");
    	double monthlyContribution = sc.nextDouble();
    	
    	System.out.println("annualGrowthRate");
    	double annualGrowthRate = sc.nextDouble();
    	
    	System.out.println("investmentPeriodMonths");
    	double investmentPeriodMonths = sc.nextInt();
    	
    	
    	
    	


        // Calculate monthly growth rate manually
        double monthlyGrowthRate = annualGrowthRate / 12 / 100; // Convert annual rate to monthly rate

        // Initialize the balance with the one-time contribution
        double balance = oneTimeContribution;

        // Calculate the balance for each month
        for (int month = 1; month <= investmentPeriodMonths; month++) {
            // Add the monthly contribution to the balance
            balance += monthlyContribution;
            // Apply growth rate to the current balance
            balance += balance * monthlyGrowthRate;
            // Print the updated balance for the month
            System.out.printf("Month %d: %.2f rupees%n", month, balance);
        }
    }
}

