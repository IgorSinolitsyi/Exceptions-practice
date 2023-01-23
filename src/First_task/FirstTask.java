package First_task;

import utils.GetDataScanner;

public class FirstTask {
    public FirstTask() {
        try {
            int num = Integer.parseInt(GetDataScanner.getDataScanner("Enter the number: "));
            System.out.println("You enter number " + num + " successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            System.exit(0);
        }

    }


}


