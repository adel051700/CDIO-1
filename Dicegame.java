import java.util.Scanner;

class Dicegame {

    public static void main(String[] args) {
        var player1Pnt = 0;
        var player2Pnt = 0;
        boolean lastThrowDouble = false;
        boolean playerOneTurn = true;
        var s = new Scanner(System.in);
        var wincon = false;
        while (!wincon) {
            if (playerOneTurn) {
                System.out.println("It's player 1's turn, press the enter button to throw the dice.");
            } else {
                System.out.println("It's player 2's turn, press the enter button to throw the dice.");
            }
            s.nextLine();
            int die1 = Dice.rollDie();
            int die2 = Dice.rollDie();

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
                    if ((player1Pnt - (die1 + die2)) >= 40) {
                        if (!playerOneTurn) {
                            System.out.println("Player 1 won, by having over 40 points and throwing identical die");
                            wincon = true;
                            break;
                        } else {
                            continue;
                        }
                    }
                    if ((player2Pnt - (die1 + die2)) >= 40) {
                        if (playerOneTurn) {
                            System.out.println("Player 2 won, by having over 40 points and throwing identical die");
                            wincon = true;
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (lastThrowDouble && die1 == 6) {
                        if (playerOneTurn) {
                            System.out.println("Player 1 Wins");
                        } else if (playerOneTurn == false) {
                            System.out.println("Player 2 Wins");
                        }

                    }

                    if (die1 == 6) {
                        lastThrowDouble = true;
                        if (playerOneTurn) {
                            playerOneTurn = true;
                        } else {
                            playerOneTurn = false;
                        }
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
        s.close();
    }
}
