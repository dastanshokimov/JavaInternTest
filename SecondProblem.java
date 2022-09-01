public class SecondProblem {
    public static void main(String args[]) {
        System.out.println("Result: " + noFive(4,17));
    }
    
    public static int noFive(int start, int finish) {
        int counter = 0; 
        for (int i = start; i <= finish; i++) {
            counter++; 
            if (i % 5 == 0 && i % 10 != 0) {
                counter--; 
            }
        }
        return counter;
    }
}