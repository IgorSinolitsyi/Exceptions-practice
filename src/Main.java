import controller.FilterExerciseNumber;
import view.GetExerciseNumber;

public class Main {
    public static void main(String[] args) {
        while (true) {
            FilterExerciseNumber.filterExerciseNumber(GetExerciseNumber.getExerciseNumber());
        }
    }
}