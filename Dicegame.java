class Dicegame {

    public static void main(String[] args) {
        var player1Pnt = 0;
        var player2Pnt = 0;
        boolean lastThrowDouble = false;
        int playerTurn = 1;
        while (true) {

            int die1 = (int) Math.floor(Math.random() * 6 + 1);
            int die2 = (int) Math.floor(Math.random() * 6 + 1);

            System.out.println("player1 : " + player1Pnt + " |" + die1 +" & "+ die2);
            System.out.println("player2 : " + player2Pnt + " |" + die1 +" & "+ die2);
        }
    }
}
