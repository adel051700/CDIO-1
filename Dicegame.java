class Dicegame {

    public static void main(String[] args) {
        var player1Pnt = 0;
        var player2Pnt = 0;
        boolean lastThrowDouble = false;
        boolean playerOneTurn = true;

        while (player1Pnt < 40 && player2Pnt < 40) {
            int die1 = (int) Math.floor(Math.random() * 6 + 1);
            int die2 = (int) Math.floor(Math.random() * 6 + 1);

            if (die1 + die2 != 2) {
                if (playerOneTurn) {
                    player1Pnt += die1 + die2;
                    System.out
                            .println("Player 1 rolls a " + die1 + " & a " + die2 + " and now has " + player1Pnt + "\n");
                    playerOneTurn = false;
                } else {
                    player2Pnt += die1 + die2;
                    System.out
                            .println("Player 2 rolls a " + die1 + " & a " + die2 + " and now has " + player2Pnt + "\n");
                    playerOneTurn = true;
                }

                if (die1 == die2) {
                    if (lastThrowDouble && die1 == 6) {
                        if (playerOneTurn) {
                            System.out.println("Player 1 Wins");
                        } else if (playerOneTurn == false) {
                            System.out.println("Player 2 Wins");
                        }

                    }

                    if (die1 == 6) {
                        lastThrowDouble = true;
                    }
                    if (playerOneTurn) {
                        playerOneTurn = false;
                    } else {
                        playerOneTurn = true;
                    }

                }
            } else {
                if (playerOneTurn) {
                    System.out.println("Player 1 rolled two 1's and loses all points \n");
                    player1Pnt = 0;
                } else {
                    System.out.println("Player 2 rolled two 1's and loses all points \n");
                    player2Pnt = 0;
                }
            }
        }
            var playerWin = player1Pnt >= 40 ? "Player 1 Wins" : "Player 2 Wins";
            System.out.println(playerWin);

        
    }
}
