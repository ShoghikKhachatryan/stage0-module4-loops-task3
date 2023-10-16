package school.mjc.stage0.loops.task3;

import java.util.Date;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println(0);

        if (lastFibonacci !=0 ) {
            int fibSecod = 1;
            int fibFirst = 0;
            for (int i = 2; i <= lastFibonacci; i++) {
                System.out.println(fibSecod);
                int oldSecond = fibSecod;
                fibSecod += fibFirst;
                fibFirst = oldSecond;
            }
        }
    }
}
