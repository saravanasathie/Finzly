import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FxTrading {
    private static final ArrayList<Trade> trades = new ArrayList<>();

    static double usdToInrRate = 90;    //Default rate

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("------------------------------------------");
            System.out.println(" Welcome to Foreign Exchange Trading Application ");
            System.out.println("Select an option : ");
            System.out.println("1. Book Trade");
            System.out.println("2. Print Trade");
            System.out.println("3. Exit");

            String choices = scanner.nextLine();

            if(!choices.matches("[1-3]")) {
                System.out.println("Invalid choice. Select a valid option (1, 2 (or) 3).");
                continue;
            }
            int choice = Integer.parseInt(choices);
            switch (choice) {
                case 1:
                    bookTrade(scanner);
                    break;
                case 2:
                    printTrades();
                    break;
                case 3:
                    exitTrade(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Select a valid option.");
            }
            }
        }
    static void bookTrade(Scanner scanner){
        while(true) {
                System.out.println("Enter Customer Name : ");
                String customerName = scanner.nextLine();
                if (!customerName.matches("^[a-zA-Z ][a-zA-Z ]*\\.?[a-zA-Z ]*$")) {
                    System.out.println("Invalid Input");
                    System.out.println("---------");
                    continue;

                }
                System.out.println("Enter Currency Pair : ");
                String currencyPair = scanner.nextLine();

                if (!currencyPair.equalsIgnoreCase("USDINR")) {
                    System.out.println("Invalid Currency Pair. Only USDINR is Supported.");
                    continue;
                }

                System.out.println("Enter amount to transfer : ");

                String amounts = scanner.nextLine();
                if(!amounts.matches("[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?$")){
                    System.out.println("try again");
                    continue;
                }
                double amount = Double.parseDouble(amounts);

                if (amount < 1) {
                    System.out.println("Check the Amount, Minimum transfer amount is 1 USD");
                    continue;
                }

                System.out.println("Do you want to get Rate (Yes/No): ");
                String rateOption = scanner.nextLine();

                double rate = usdToInrRate;
                double inrAmount = amount * rate;
                trades.add(new Trade(trades.size() + 1, customerName, currencyPair, inrAmount, rate));

                rateCondition(scanner, rateOption, inrAmount, customerName, rate);
                tradeCondition(scanner, currencyPair, inrAmount, customerName, rate);
                return;
            }
        }


    static void rateCondition(Scanner scanner, String rateOption, double inrAmount, String customerName, double rate){

        while(true){
            if (rateOption.equalsIgnoreCase("Yes")){
                System.out.println("You are transferring INR " + formatAmount(inrAmount) +
                        " to " + customerName + ".(Assuming that rate was " +
                        formatRate(rate) + ")" );
                return;
            }else if(rateOption.equalsIgnoreCase("No")){
                System.out.println("Okay. Continue");
                return;
            }else{
                System.out.println("Invalid Input, try again with yes (or) no");
                rateOption = scanner.nextLine();
            }
        }
    }
    static void tradeCondition(Scanner scanner, String currencyPair, double inrAmount, String customerName, double rate){
        System.out.println("Book/Cancel this trade? ");
        String tradeChoice = scanner.nextLine();
        while(true){
            if(tradeChoice.equalsIgnoreCase("Book")){
                System.out.println("Trade for " + currencyPair + " has been booked with rate " + formatRate(rate) +
                        ". The amount of Rs "+ formatAmount(inrAmount) +
                        " will be transferred in 2 working days to " + customerName.toUpperCase() + ".");
                break;
            }else if(tradeChoice.equalsIgnoreCase("Cancel")){
                System.out.println("Trade is Canceled. ");
                trades.remove(trades.size() - 1);
                break;
            }else {
                System.out.println("Invalid Input, try again with Book (or) Cancel");
                tradeChoice = scanner.nextLine();
            }
        }
    }
    static void printTrades(){
        System.out.println("---------------------------------------------------------");
        System.out.println("TradeNo     CurrencyName  CustomerPair  Amount       Rate");
        for(Trade trade : trades){
            System.out.printf("%-12d %-13s %-12s %-12s %s%n", trade.getTradeNo(), trade.getCurrencyPair().toUpperCase(),
                    trade.getCustomerName().toUpperCase(), formatAmount(trade.getAmount()), formatRate(trade.getRate()));
        }
    }

    static String formatAmount(double amount){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return decimalFormat.format(amount);
    }
    static String formatRate(double rate){
        return String.format("%.2f", rate);
    }
    static void exitTrade(Scanner scanner){
        System.out.println("Do You really want to exit (y/n)");
        String exitChoice = scanner.nextLine();

        while (true){
            if (exitChoice.equalsIgnoreCase("y")) {
                System.out.println("Bye - Have a Good Day.");
                System.exit(0);
            } else if (exitChoice.equalsIgnoreCase("n")) {
                System.out.println("Okay. Continue");
                break;
            }else{
                System.out.println("Invalid Input, try again with y (or) n");
                exitChoice = scanner.nextLine();
            }
        }

    }
}
