package controller;

import First_task.FirstTask;
import Fourth_task.FourthTask;
import Second_task.SecondTask;
import Third_task.ThirdTask;

public class FilterExerciseNumber {
    public static void filterExerciseNumber(int option) {
        switch (option) {
            case 1 -> {
                FirstTask firstTask = new FirstTask();
            }
            case 2 -> {
                SecondTask secondTask = new SecondTask();
            }
            case 3 -> {
                ThirdTask thirdTask = new ThirdTask();
            }
            case 4 -> {
                FourthTask fouTask = new FourthTask();
            }
            case 5 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }
    }
}
