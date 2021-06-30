package Generic;

public class ScoreBunco implements IStrategy {

    @Override
    public void calculateScoreRound(Game game){
        System.out.println("\n-- Round " + game.getNumberOfTurn() + " --");

        if(game.getNumberOfMaxTurns() < game.getNumberOfTurn()){
            System.out.println("The game has ended !");
            return;
        }

        while (game.getPlayerIterator().hasNext()){
            Player player = (Player) game.getPlayerIterator().next();
            int firstNum = ((Die) game.getDice().getFirst()).getFaceRolled();
            int diceEqualToTurn =0 ;
            boolean isAllFaceEqual = true;

            System.out.print("Player "+ player.getID() + " rolled");
            while (game.getDiceIterator().hasNext()){
                Die die = (Die) game.getDiceIterator().next();
                die.rollDie();
                System.out.print(" " +die.getFaceRolled());
                // face equal to the turn +1 point (max 2 dice)
                if(die.getFaceRolled() == game.getNumberOfTurn()){
                    diceEqualToTurn += 1;
                }

                // 3 faces equal
                if(die.getFaceRolled() != firstNum){
                    isAllFaceEqual = false;
                }
            }

            System.out.println();
            //3 faces equal to turn
            if (diceEqualToTurn == game.getDice().size()){
                player.setPlayerScore(21);
                System.out.println("Bunco ! player " + player.getID() + " has " + player.getPlayerScore() + " points");
                //3 faces equal
            }else if (isAllFaceEqual){
                player.setPlayerScore(player.getPlayerScore()+5);
                System.out.println("(all face equal) Turn number " + game.getNumberOfTurn() + " -- Added " + diceEqualToTurn + " points to player " + player.getID());
                //die equal to turn
            }else {
                player.setPlayerScore(player.getPlayerScore() + diceEqualToTurn);
                System.out.println("(dice equal to turn) Turn number " + game.getNumberOfTurn() + " -- Added " + diceEqualToTurn + " points to player " + player.getID());
            }

        }
        game.setNumberOfTurn(game.getNumberOfTurn() + 1 );
    }

    @Override
    public void calculateTheWinner(Game game){
        game.players.sort();

        System.out.println("\n-- Score Board --");
        while (game.getPlayerIterator().hasNext()){
            Player player = (Player) game.getPlayerIterator().next();
            System.out.println("Player " + player.getID() + " has " + player.getPlayerScore() + " points !");
        }

        System.out.println("\nThe winner is player " + ((Player) game.getPlayers().getFirst()).getID() + " with " + ((Player) game.getPlayers().getFirst()).getPlayerScore() + " points !");
    }

}
