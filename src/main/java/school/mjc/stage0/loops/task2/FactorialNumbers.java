package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while(i <= printToInclusive){
            i++;
//            factorial of i:
            int factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial *= j;
            }
            System.out.println(factorial);
        }
    }
}
