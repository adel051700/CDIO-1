public class TestDice {
    public static void main(String[] args){

        // How many rolls you would like to test with
        int amountOfTestRolls = 1000;

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
        int rollDouble = 0;
        double deviation = 0.0;

        for (int i = 0; i < amountOfTestRolls; i++){
        int die1 = Dice.rollDie();
        int die2 = Dice.rollDie();
        int sum = die1 + die2;

            if(die1 == die2){
                rollDouble++;
            }

            switch (sum){
                case 2 -> { 
                    sumis2++;
                }
                case 3 -> {
                    sumis3++;
                }
                case 4 -> {
                    sumis4++;
                }
                case 5 -> {
                    sumis5++;
                }
                case 6 -> {
                    sumis6++;
                }
                case 7 -> {
                    sumis7++;
                }
                case 8 -> {
                    sumis8++;
                }
                case 9 -> {
                    sumis9++;
                } 
                case 10 -> {
                    sumis10++;
                }
                case 11 -> {
                    sumis11++;
                }
                case 12 -> {
                    sumis12++;
                }
            }

            deviation += Math.sqrt(Math.pow((sum - 7),2));
        }
        double standardDeviation = deviation / amountOfTestRolls;
        double afvigelse = (standardDeviation / Math.sqrt(amountOfTestRolls)) * 100;
        
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
        System.out.println("You have rolled " + rollDouble + " doubles");

        System.out.println("This test deviates " + afvigelse + "% from the actual probabilities when rolling two dice");
        System.out.println("This test has a standard deviation of " + standardDeviation + " from the actual probabilities when rolling two dice \n");
        if (afvigelse < 10.0){
            System.out.println("The dice are fair, because they deviate under 10% from the actual probability when rolling two dice");
        } else {
            System.out.println("The dice are not fair, becuase they deviate more than 10% from the actual probability when rolling two dice");
        }
    }
  
}
