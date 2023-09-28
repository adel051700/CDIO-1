public class TestDice {
    public static void main(String[] args){
        int sumis2 = 0;
        int sumis3 = 0;
        int sumis4 = 0;
        int sumis5 = 0;
        int sumis6 = 0;
        int sumis7 = 0;
        int sumis8 = 0;
        int sumis9 = 0;
        int sumis10 = 0;
        int sumis11 = 0;
        int sumis12 = 0;

        for (int i = 0; i < 1000; i++){
        int die1 = Dice.rollDie();
        int die2 = Dice.rollDie();
        int sum = die1 + die2;
        
            switch (sum){
                case 2 -> { 
                    sumis2 = sumis2 + 1;
                }
                case 3 -> {
                    sumis3 = sumis3 + 1;
                }
                case 4 -> {
                    sumis4 = sumis4 +1 ;
                }
                case 5 -> {
                    sumis5 = sumis5 + 1;
                }
                case 6 -> {
                    sumis6 = sumis6 + 1;
                }
                case 7 -> {
                    sumis7 = sumis7 + 1;
                }
                case 8 -> {
                    sumis8 = sumis8 + 1;
                }
                case 9 -> {
                    sumis9 = sumis9 + 1;
                } 
                case 10 -> {
                    sumis10 = sumis10 + 1;
                }
                case 11 -> {
                    sumis11 = sumis11 + 1;
                }
                case 12 -> {
                    sumis12 = sumis12 + 1;
                }
            }

        }
        System.out.println("You have rolled " + sumis2 + " 2's");
        System.out.println("You have rolled " + sumis3 + " 3's");
        System.out.println("You have rolled " + sumis4 + " 4's");
        System.out.println("You have rolled " + sumis5 + " 5's");
        System.out.println("You have rolled " + sumis6 + " 6's");
        System.out.println("You have rolled " + sumis7 + " 7's");
        System.out.println("You have rolled " + sumis8 + " 8's");
        System.out.println("You have rolled " + sumis9 + " 9's");
        System.out.println("You have rolled " + sumis10 + " 10's");
        System.out.println("You have rolled " + sumis11 + " 11's");
        System.out.println("You have rolled " + sumis12 + " 12's");

    }   
}
