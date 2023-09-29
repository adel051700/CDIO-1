/**
 * Class has method rollDie, that returns a random integer between 1 and 6.
 */
import java.util.Random;

class Dice {    

    public static int rollDie() {
        Random r = new Random();
        int upBound = 6;
        int rInt = r.nextInt(upBound);

        return rInt + 1; 

    }
    
}

