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

        double eP2n12 = (1.0/36.0) * amountOfTestRolls;
        double eP3n11 = (2.0/36.0) * amountOfTestRolls;
        double eP4n10 = (3.0/36.0) * amountOfTestRolls; 
        double eP5n9 = (4.0/36.0) * amountOfTestRolls;
        double eP6n8 = (5.0/36.0) * amountOfTestRolls;
        double eP7 = (6.0/36.0) * amountOfTestRolls;
        double ePD = (1.0/6.0) * amountOfTestRolls;
        double tP2 = sumis2;
        double tP3 = sumis3;
        double tP4 = sumis4;
        double tP5 = sumis5;
        double tP6 = sumis6;
        double tP7 = sumis7;
        double tP8 = sumis8;
        double tP9 = sumis9;
        double tP10 = sumis10;
        double tP11 = sumis11;
        double tP12 = sumis12;
        double tPD = rollDouble;
        double testDeviation = ((Math.abs(tP2 - eP2n12) / eP2n12) + 
                                (Math.abs(tP3 - eP3n11) / eP3n11) + 
                                (Math.abs(tP4 - eP4n10) / eP4n10) + 
                                (Math.abs(tP5 - eP5n9) / eP5n9) + 
                                (Math.abs(tP6 - eP6n8) / eP6n8) + 
                                (Math.abs(tP7 - eP7) / eP7) + 
                                (Math.abs(tP8 - eP6n8) / eP6n8) + 
                                (Math.abs(tP9 - eP5n9) / eP5n9) + 
                                (Math.abs(tP10 - eP4n10) / eP4n10) + 
                                (Math.abs(tP11 - eP3n11) / eP3n11) + 
                                (Math.abs(tP12 - eP2n12) / eP2n12) +
                                (Math.abs(tPD - ePD) / ePD)) * 100.0 / 12.0;



        System.out.println("This test deviates " + testDeviation + "% from the actual probabilities when rolling two dice");
        System.out.println(standardDeviation);
    }

    }
