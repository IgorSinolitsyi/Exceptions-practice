package Third_task;

import Fourth_task.InvalidTemperatureException;
import utils.GetDataScanner;

public class ThirdTask {
    public ThirdTask() {
        double accountBalance = 50000.4d;
        try {
            double price = Double.parseDouble(GetDataScanner.getDataScanner("Enter the sum to pay: "));
            try {
                validate(price, accountBalance);
            } catch (InvalidTemperatureException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Not number format! Wrong sum entre");
            System.exit(0);
        }
    }

    private static void validate(double price, double accountBalance) throws InvalidTemperatureException {
        if (accountBalance < price) {
            throw new InvalidTemperatureException("Insufficient funds on the account!");
        } else {
            System.out.println("You can buy it!");
        }
    }
}

