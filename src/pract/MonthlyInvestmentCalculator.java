package pract;


public class MonthlyInvestmentCalculator {
    public static void main(String[] args) {
        // Input values
        double oneTimeContribution = 5000;
        double annualGrowthRate = 12;
        double monthlyContribution = 1000;
        int investmentPeriodMonths = 60; // 5 years

        // Calculate monthly growth rate manually
        double monthlyGrowthRate = calculateMonthlyGrowthRate(annualGrowthRate);

        // Initialize the balance with the one-time contribution plus the first monthly contribution
        double balance = oneTimeContribution + monthlyContribution;

        // Print initial balance
        System.out.printf("Month 1: %.2f rupees%n", balance);

        // Calculate the updated balance for each subsequent month
        for (int month = 2; month <= investmentPeriodMonths; month++) {
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
        double monthlyRate = annualGrowthRate / 12 / 100; // Convert annual rate to monthly rate
        return monthlyRate;
    }
}
