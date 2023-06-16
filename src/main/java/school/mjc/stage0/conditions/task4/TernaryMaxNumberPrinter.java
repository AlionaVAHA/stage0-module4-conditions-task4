package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;
int finalRes;
        int b = first < second ?  ( result = second): (result= first);
        int d = result<third ? (finalRes = third) : (finalRes = result);
        System.out.println(finalRes);
    }
}
