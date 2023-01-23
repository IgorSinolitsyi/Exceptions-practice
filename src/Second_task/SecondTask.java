package Second_task;

import utils.FormatValue;
import utils.GetDataScanner;

public class SecondTask {
    private static final double[] productPrice = new double[]{300.4d, 303.4d, 301.1d, 300.0d, 310.5d};

    public SecondTask() {
        try {
            int indexProductPrice = Integer.parseInt(GetDataScanner.getDataScanner("Enter index in range 0 - 4, to search price: "));
            double price = productPrice[indexProductPrice];
            System.out.println("Your price is " + FormatValue.FormatMoneyValue(price) + " found successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Not index format! Only integer in range 0 - 4");
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of range! Only in range 0 - 4");
            System.exit(0);
        }

    }


}


