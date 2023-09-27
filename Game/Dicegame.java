import java.util.Scanner;

class Dicegame {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var winCon = false;
        
        int player1Pnt = Player(0);
        int player2Pnt = Player(0);

        boolean lastThrowDouble = false;
        boolean playerOneTurn = true;

// The code snippet provided is a part of a dice game. It represents the main game loop where players
// take turns rolling two dice and accumulating points based on the sum of the dice rolls.
        while (!winCon) {
            int die1 = Dice.rollDie();
            int die2 = Dice.rollDie();

            if (playerOneTurn) {
                System.out.println("It's player 1's turn, press the enter button to throw the dice.");

            } else {
                System.out.println("It's player 2's turn, press the enter button to throw the dice.");

            }
            s.nextLine();

// The code block you provided is checking if the sum of the two dice rolls is not equal to 2. If it is
// not equal to 2, it means that the player did not roll two 1's.
            if (die1 + die2 != 2) {
                if (playerOneTurn) {
                    player1Pnt += die1 + die2;
                    System.out.println("Player 1 rolls a " + die1 + " & a " + die2 + " and now has " + player1Pnt + "\n");

                } else {
                    player2Pnt += die1 + die2;
                    System.out.println("Player 2 rolls a " + die1 + " & a " + die2 + " and now has " + player2Pnt + "\n");

                }

// The code block you provided is checking if the two dice rolls are equal (i.e., if the player rolled
// a double). If the rolls are equal, it performs the following actions:
                if (die1 == die2) {

                    // This code block is checking if a player has accumulated 40 or more points and
                    // has rolled a double (i.e., both dice have the same value). If these conditions
                    // are met, it declares the player as the winner and sets the `winCon` variable to
                    // `true` to exit the game loop.
                    if ((player1Pnt - (die1 + die2)) >= 40) {
                        if (playerOneTurn) {
                            System.out.println("Player 1 won, by having over 40 points and throwing identical die");
                            winCon = true;
                            break;

                        } else {
                            continue;
                            
                        }
                    }

                    if ((player2Pnt - (die1 + die2)) >= 40) {
                        if (!playerOneTurn) {
                            System.out.println("Player 2 won, by having over 40 points and throwing identical die");
                            winCon = true;
                            break;

                        } else {
                            continue;

                        }
                    }
// The code block you provided is checking if the variable `lastThrowDouble` is `true` and if the value
// of `die1` (the first dice roll) is equal to 6.
                    if (lastThrowDouble && die1 == 6) {
                        if (playerOneTurn) {
                            System.out.println("Player 1 Wins");
                            
                        } else if (!playerOneTurn) {
                            System.out.println("Player 2 Wins");

                        }

                    }

// This code block is checking if the value of `die1` (the first dice roll) is equal to 6. If it is, it
// sets the variable `lastThrowDouble` to `true`.
                    if (die1 == 6) {
                        lastThrowDouble = true;

                        if ((player1Pnt - (die1 + die2)) >= 40) {
                            if (playerOneTurn) {
                                System.out.println("Player 1 won, by having over 40 points and throwing identical die");
                                winCon = true;
                                break;

                            } else {
                                continue;

                            }
                        }
                        if ((player2Pnt - (die1 + die2)) >= 40) {
                            if (!playerOneTurn) {
                                System.out.println("Player 2 won, by having over 40 points and throwing identical die");
                                winCon = true;
                                break;
                            } else {
                                continue;

                            }
                        }

                    }
// The code block you provided is toggling the value of the boolean variable `playerOneTurn`. If
// `playerOneTurn` is `true`, it sets it to `false`, and if it is `false`, it sets it to `true`. This
// is done to switch the turn between Player 1 and Player 2 in the game.
                    if (!playerOneTurn) {
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

    private static int Player(int i) {
        return 0;
        
    }
}
