import java.util.Arrays;  

public class FirstProblem {
    public static void main(String args[]) {
        int[] givenArray = {4,3,9,7,2,1};
        System.out.println(sqrtOrNot(givenArray));
    }
    
    public static String sqrtOrNot(int[] givenArray) {
        int[] newArray = new int[givenArray.length];
        int i = 0; 
        
        for (int element : givenArray) {
            if (Math.ceil(Math.pow(element, 0.5)) == Math.pow(element, 0.5)) {
                newArray[i] = (int) Math.pow(element, 0.5);
                i++;
            } else {
                newArray[i] = (int) Math.pow(element, 2);
                i++;
            }    
        }
        return Arrays.toString(newArray); 
    }
}