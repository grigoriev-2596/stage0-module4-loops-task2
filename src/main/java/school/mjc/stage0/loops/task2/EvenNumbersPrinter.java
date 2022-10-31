package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int currEvenNumber = 0;
        while (currEvenNumber <= printTillInclusive) {
            System.out.println(currEvenNumber);
            currEvenNumber += 2;
        }
    }
}
