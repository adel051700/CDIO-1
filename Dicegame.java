class Dicegame {
        public static void main(String[] args) {
            var player1 = new Player(1,0);
            var player2 = new Player(2,0);

            int die1 = Dice.rollDie();
            int die2 = Dice.rollDie();

            int playerTurn = 1;
            int deanos = isSame.isSame(die1,die2,playerTurn);
            System.out.println(playerTurn);

}
        public static void testfunc(int die1, int die2)
        {
            player1.points = 10;
        }
}
