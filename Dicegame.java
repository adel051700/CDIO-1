class Dicegame {

    public static void main(String[] args) {
        var player1Pnt = 0;
        var player2Pnt = 0;
        boolean lastThrowDouble = false;
        int playerTurn = 1;
        while (true) {

            int die1 = (int) Math.floor(Math.random() * 6 + 1);
            int die2 = (int) Math.floor(Math.random() * 6 + 1);

            int deltaPoints = die1 + die2;
            if (die1 == die2) {
                if (lastThrowDouble == true && die1==6) {
                    System.out.println("Player " + playerTurn + " wins!");
                    break;
                }
                if (die1==6){
                lastThrowDouble = true;
                }
                if (playerTurn == 1) {
                    player1Pnt = player1Pnt + deltaPoints;

                    if (die1 == 1) {
                        player1Pnt = 0;
                    } else {
                        player2Pnt = 0;
                    }
                } else {
                    player2Pnt = player2Pnt + deltaPoints;
                }
            } else if (playerTurn == 1) {
                player1Pnt = player1Pnt + deltaPoints;

            } else {
                player2Pnt = player2Pnt + deltaPoints;

            }
            if (player1Pnt >= 40 || player2Pnt >= 40) {
                System.out.println("Player " + playerTurn + " wins!");
                break;
            }
            if (die1 != die2) {

                if (playerTurn == 1) {
                    playerTurn = 2;
                    lastThrowDouble = false;
                } else {
                    playerTurn = 1;
                    lastThrowDouble = false;
                }
            }
            System.out.println("player1 : " + player1Pnt + " |" + die1 +" & "+ die2);
            System.out.println("player2 : " + player2Pnt + " |" + die1 +" & "+ die2);
        }
    }
}
