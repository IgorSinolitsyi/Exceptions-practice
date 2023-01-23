package Fourth_task;

import utils.GetDataScanner;

public class FourthTask {
    private static final float fromTemperature = -10;
    private static final float toTemperature = 35;

    public FourthTask() {
        try {
            float currentTemperature = Float.parseFloat(GetDataScanner.getDataScanner("Enter current temperature: "));
            validateTemperature(currentTemperature);
            System.out.println("Your device work good when temperature is " + currentTemperature + " !");
        } catch (NumberFormatException e) {
            System.out.println("Not number format! Wrong temperature value!");
            System.exit(0);
        } catch (InvalidTemperatureException e) {
            System.out.println("An exception has occurred: " + e);
            System.exit(0);
        }

    }

    static void validateTemperature(float temperature) throws InvalidTemperatureException {

        if (temperature >= fromTemperature && temperature <= toTemperature) {
            System.out.println("Temperature " + temperature + " is OK");
        } else if (temperature > toTemperature) {
            throw new InvalidTemperatureException("\nTemperature " + temperature + " is too HOT!");
        } else {
            throw new InvalidTemperatureException("\nTemperature " + temperature + " is too COLD!");
        }
    }
}