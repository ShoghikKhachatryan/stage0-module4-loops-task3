package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0){
            System.out.println(0);
        } else {
            int result = 0;
            int nextNine = 0;

            for (int i = 0 ; i < lengthOfLastNumber ; i++) {
                nextNine = nextNine * 10 + 9;
                result += nextNine;
            }
            System.out.println(result);
        }
    }
}
