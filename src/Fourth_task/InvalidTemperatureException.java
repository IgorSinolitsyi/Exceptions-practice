package Fourth_task;

public class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String str) {
        System.out.println(str);
        System.exit(0);
        //super(str);
    }
}
