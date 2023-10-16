package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first == 0) {
            System.out.println(second);
            return;
        }

        if(second == 0) {
            System.out.println(first);
            return;
        }

        if (first % second == 0) {
            System.out.println(first);
            return;
        }

        if (second % first == 0) {
            System.out.println(second);
            return;
        }

        int commenDivisor = 1;

        for(int i = 2; i <= (first <= second ? first /2 : second /2); i++) {
            if (first % i == 0  && second % i == 0) {
                commenDivisor = i;
            }
        }

        System.out.println(commenDivisor);
    }
}
