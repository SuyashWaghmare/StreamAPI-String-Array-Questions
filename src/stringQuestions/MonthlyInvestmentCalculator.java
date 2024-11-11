package stringques;
import java.util.Scanner;

public class MonthlyInvestmentCalculator {
    public static void main(String[] args) {
        // Input values
        double oneTimeContribution = 5000;
        double annualGrowthRate = 12;
        double monthlyContribution = 1000;
        int investmentPeriodMonths = 60; // 5 years

        // Calculate monthly growth rate manually
        double monthlyGrowthRate = calculateMonthlyGrowthRate(annualGrowthRate);

        // Initialize the balance with the one-time contribution
        double balance = oneTimeContribution;

        // Print initial balance
        System.out.printf("Month 0: %.2f rupees%n", balance);

        // Calculate the updated balance for each month
        for (int month = 1; month <= investmentPeriodMonths; month++) {
            // Apply growth rate to the current balance
            balance += balance * monthlyGrowthRate;
            // Add the monthly contribution
            balance += monthlyContribution;
            // Print the updated balance for the month
            System.out.printf("Month %d: %.2f rupees%n", month, balance);
        }
    }

    // Function to calculate monthly growth rate manually
    public static double calculateMonthlyGrowthRate(double annualGrowthRate) {
        double rate = 1 + annualGrowthRate / 100.0;
        double monthlyRate = rate;
        for (int i = 1; i < 12; i++) {
            monthlyRate *= rate;
        }
        return (monthlyRate - 1) / 12.0;
    }
}
