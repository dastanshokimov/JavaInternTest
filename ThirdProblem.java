import java.util.HashMap; 

public class ThirdProblem {
    public static void main(String args[]) {
        System.out.println(countWithFingers(50));
    }
    
    public static String countWithFingers(int num) {
        
        HashMap<Integer, String> fingers = new HashMap<>();
        fingers.put(1, "Большой палец");
        fingers.put(2, "Указательный палец");
        fingers.put(3, "Средний палец");
        fingers.put(4, "Безымянный палец");
        fingers.put(5, "Мизинец");
                
        int finger = 0; 
        
        for (int i = 1; i <= num; i++) {
            if (finger == 5) { 
                for (int j = 4; j >= 1; j--){
                    finger--;
                    i++;
                }
            }
            finger++;
        }
        return fingers.get(finger);
    }
}