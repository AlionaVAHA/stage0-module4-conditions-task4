package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result;
        int b = first < second ?  ( result = second): (result= first);
        System.out.println(result);
    }
}
