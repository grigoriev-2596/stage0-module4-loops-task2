package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currNumber = 0;
        while(currNumber <= printToInclusive) {
            if (numberIsPrime(currNumber)) System.out.println(currNumber);
            currNumber++;
        }
    }

    public boolean numberIsPrime(int number) {
        int divider = 2;
        while(divider < Math.sqrt(number)) {
            if (number % divider == 0) return false;
            divider++;
        }
        return true;
    }
}
