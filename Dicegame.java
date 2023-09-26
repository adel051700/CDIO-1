class Dicegame {

    public static void main(String[] args) {
        var player1 = 0;
        var player2 = 0;
        boolean lastThrowDouble = false;
        int playerTurn = 1;
        while (true) {

            int die1 = (int) Math.floor(Math.random() * 6 + 1);
            int die2 = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println(die1 + " " + die2);

            int deltaPoints = die1 + die2;
            if (die1 == die2) {
                if (lastThrowDouble == true) {
                    System.out.println("Player " + playerTurn + " wins!");
                    break;
                }
                lastThrowDouble = true;
                if (playerTurn == 1) {
                    player1 = player1 + deltaPoints;

                    if (die1 == 1) {
                        player1 = 0;
                    } else {
                        player2 = 0;
                    }
                } else {
                    player2 = player2 + deltaPoints;
                }
            } else if (playerTurn == 1) {
                player1 = player1 + deltaPoints;

            } else {
                player2 = player2 + deltaPoints;

            }
            if (player1 >= 40 || player2 >= 40) {
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
            System.out.println("player1 : " + player1);
            System.out.println("player2 : " + player2);
        }
    }
}
