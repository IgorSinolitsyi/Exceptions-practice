package Third_task;

import utils.GetDataScanner;

public class ThirdTask {
    public ThirdTask() {
        double accountBalance = 50000.4d;
        try {
            double price = Double.parseDouble(GetDataScanner.getDataScanner("Enter the sum to pay: "));
            validate(price, accountBalance);
        } catch (NumberFormatException e) {
            System.out.println("Not number format! Wrong sum entre");
            System.exit(0);
        }
    }

    private static void validate(double price, double accountBalance) {
        if (accountBalance < price) {
            throw new ArithmeticException("Insufficient funds on the account!");
        } else {
            System.out.println("You can buy it!");
        }
    }
}

