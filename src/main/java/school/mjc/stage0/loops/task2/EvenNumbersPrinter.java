package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int start = 0;
        while(start <= printTillInclusive){
            start++;
            if(start % 2 == 0){
                System.out.println(start);
            }
        }
    }
}
