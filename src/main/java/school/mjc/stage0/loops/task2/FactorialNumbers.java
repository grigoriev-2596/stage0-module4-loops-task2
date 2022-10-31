package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currNumber = 0;
        while(currNumber <= printToInclusive) {
            System.out.println(getFactorial(currNumber));
            currNumber++;
        }
    }

    public int getFactorial(int n) {
        if (n == 0) return 1;
        int product = 1;
        int currMultiplier = 2;
        while(currMultiplier <= n) {
            product *= currMultiplier;
            currMultiplier++;
        }
        return product;
    }
}
