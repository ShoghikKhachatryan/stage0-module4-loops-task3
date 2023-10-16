package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int length = (t + "").length();
        int sum = 0;
         t = t < 0 ? t *(-1) : t;
        for(int i = 0; i < (length - 1) && (t /10) != 0; i++) {
            sum += t % 10;
            t /= 10;
        }
        sum += t;
        System.out.println(sum);
    }
}
