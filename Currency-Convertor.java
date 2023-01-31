import java.util.Scanner;

    public class ForexExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double exchangeRateUSDtoEUR = 0.9; // The exchange rate from USD to EUR
        double exchangeRateUSDtoGBP = 0.8; // The exchange rate from USD to GBP
        double exchangeRateUSDtoJPY = 109.5; // The exchange rate from USD to JPY

        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the currency to convert from (USD, EUR, GBP, JPY): ");
        String fromCurrency = input.next();

        System.out.print("Enter the currency to convert to (USD, EUR, GBP, JPY): ");
        String toCurrency = input.next();

        double convertedAmount = 0;
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
        convertedAmount = amount * exchangeRateUSDtoEUR;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
        convertedAmount = amount * exchangeRateUSDtoGBP;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
        convertedAmount = amount * exchangeRateUSDtoJPY;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
        convertedAmount = amount / exchangeRateUSDtoEUR;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
        convertedAmount = amount / exchangeRateUSDtoGBP;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
        convertedAmount = amount / exchangeRateUSDtoJPY;
        } else {
        System.out.println("Invalid currency conversion.");
        return;
        }

        System.out.println("The equivalent amount is: " + convertedAmount + " " + toCurrency);
    }
    }
