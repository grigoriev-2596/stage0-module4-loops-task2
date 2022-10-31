package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int bound = Math.abs(multiplyByAndToInclusive);
        int currMultiplier = 0;
        while(currMultiplier <= bound) {
            System.out.println(currMultiplier * multiplyByAndToInclusive);
            currMultiplier++;
        }
    }
}
