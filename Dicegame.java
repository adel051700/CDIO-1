class Dicegame {
        public static void main(String[] args) {
            var player1 = new Player(1,0);
            var player2 = new Player(2,0);

           int die1 = Dice.rollDie();
            int die2 = Dice.rollDie();

            int playerTurn = isSame.isSame(die1,die2);
            System.out.println(playerTurn);

}
}
