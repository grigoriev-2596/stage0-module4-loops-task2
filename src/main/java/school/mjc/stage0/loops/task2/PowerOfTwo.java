package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) System.out.println("too much power");
        else {
            int product = 1;
            int currPower = 0;
            while(currPower < power) {
                product *= 2;
                currPower++;
            }
            System.out.println(product);
        }
    }
}
