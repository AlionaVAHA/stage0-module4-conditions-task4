package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greates;
        int b = first < second ?  ( greates = second): (greates= first);
        System.out.println(greates);
    }
}
