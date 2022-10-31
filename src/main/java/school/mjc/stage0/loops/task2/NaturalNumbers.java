package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int currNumber = 0;
        while(currNumber <= lastPrinted) {
            System.out.println(currNumber);
            currNumber++;
        }
    }
}
