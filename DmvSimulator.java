
import java.util.Random;

public class DmvSimulator {
    
    public static void main(String[] args) {
        
        // welcome message
        System.out.println("Welcome to the DMV. \nPlease take a number and someone will be with you shortly!\n");

        // create a random number
        Random random = new Random();
        int num = random.nextInt(200) + 1;

        // creates random miracle number
        int numMir = random.nextInt(100);

        // tells user what number they have
        System.out.println("Your number is: " + num);
        System.out.println("");

        for (int i = num + 1; i<201; i++) {
            System.out.println("Next: " + i);
        }

        for (int j = 1; j<num; j++) {
            System.out.println("Next: " + j);
        }

        System.out.println("Last Number: " + num);

        if(numMir == 0) {
            System.out.println("I guess this is enough paperwork.");
        } else {
            System.out.println("You don't have the required paperwork, stupid.");
            System.out.println("Now leave and NEVER COME BACK."); 
            System.out.println("Muahahahahahahahaha");
        }        
    }
}
