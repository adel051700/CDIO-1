/**
 * Class has method rollDie, that returns a random integer between 1 and 6.
 */
class Dice {

    public static int rollDie()
    {
        return (int)Math.floor(Math.random() * 6 + 1);
    }
    
}

