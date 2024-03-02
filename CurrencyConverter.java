import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency rates (for demonstration purposes, you would fetch these from an API)
        double usdToEuroRate = 0.82;
        double usdToGBP = 0.72;
        double usdToINR = 73.78;

        // Currency symbols
        String usdSymbol = "USD";
        String euroSymbol = "EUR";
        String gbpSymbol = "GBP";
        String inrSymbol = "INR";

        System.out.println("Welcome to Currency Converter!");

        // Currency Selection: Allow the user to choose the base currency and the target currency
        System.out.println("Select Base Currency:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.print("Enter your choice: ");
        int baseCurrencyChoice = scanner.nextInt();

        System.out.println("\nSelect Target Currency:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.print("Enter your choice: ");
        int targetCurrencyChoice = scanner.nextInt();

        // Amount Input: Take input from the user for the amount they want to convert
        System.out.print("\nEnter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Currency Conversion: Convert the input amount from the base currency to the target currency
        double convertedAmount = 0;
        switch (baseCurrencyChoice) {
            case 1: // USD
                switch (targetCurrencyChoice) {
                    case 1: // EUR
                        convertedAmount = amount * usdToEuroRate;
                        System.out.printf("\n%.2f %s is %.2f %s\n", amount, usdSymbol, convertedAmount, euroSymbol);
                        break;
                    case 2: // GBP
                        convertedAmount = amount * usdToGBP;
                        System.out.printf("\n%.2f %s is %.2f %s\n", amount, usdSymbol, convertedAmount, gbpSymbol);
                        break;
                    case 3: // INR
                        convertedAmount = amount * usdToINR;
                        System.out.printf("\n%.2f %s is %.2f %s\n", amount, usdSymbol, convertedAmount, inrSymbol);
                        break;
                    default:
                        System.out.println("Invalid target currency choice");
                }
                break;
            default:
                System.out.println("Invalid base currency choice");
        }

        scanner.close();
    }
}
