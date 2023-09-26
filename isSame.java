class isSame {

    public static int isSame(int Die1, int Die2) {
        
        if(Die1 == 1 && Die2 == 1) {
            System.out.println("You lose all points");

        }else if(Die1 == Die2) {
            System.out.println("You get another throw");
            DiceCups.sum(Die1, Die2);
        }
        var playerTurn = 1;
        return playerTurn;
    }    
}
