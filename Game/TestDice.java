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
        int rollDouble = 0;
        double deviation = 0.0;

        for (int i = 0; i < 1000; i++){
        int die1 = Dice.rollDie();
        int die2 = Dice.rollDie();
        int sum = die1 + die2;

            if(die1 == die2){
                rollDouble = rollDouble +1;
            }

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

            deviation = deviation + (sum - 7) * (sum - 7);
        }
        double standardDeviation = deviation / 1000;
        double afvigelse = (standardDeviation / Math.sqrt(1000)) * 100;
        System.out.println(afvigelse);
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

        double eP2n12 = (1.0/36.0) * 1000.0;
        double eP3n11 = (2.0/36.0) * 1000.0;
        double eP4n10 = (3.0/36.0) * 1000.0; 
        double eP5n9 = (4.0/36.0) * 1000.0;
        double eP6n8 = (5.0/36.0) * 1000.0;
        double eP7 = (6.0/36.0) * 1000.0;
        double ePD = (1.0/6.0) * 1000.0;
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

    }

    }