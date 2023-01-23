package view;

import utils.GetDataScanner;

public class GetExerciseNumber {
    public static int getExerciseNumber() {
        String CHOOSE_TASK_VIEW = """
                Choose a task:
                1 - First task
                2 - Second task
                3 - Third task
                4 - Fourth task
                5 - Exit
                """;
        return Integer.parseInt(GetDataScanner.getDataScanner("\n"+CHOOSE_TASK_VIEW));
    }
}
