/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author max ivanov
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    int p1score=0;  //player 1's score aka amount of cards won
    int p2score=0; //same but for player 2
    //card 1 and 2 = new card that will suffle for each round
    ArrayList<Card> total = new ArrayList<>();
    //total is the arraylist of all the cards in a deck - jokers
    //total will have the card removed each round to imitate picking up the card

    public Game(String name) {
        
        this.name = name;
        players = new ArrayList<Player>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();
    
    

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();
    
    //NEWCODE/comparison and scoring sector of WAR
    //@author chris mergelos
    public void comparison(Card card1, Card card2, ArrayList<Card> total){
        //remove cards drawn
        total.remove(card1);
        total.remove(card2);
        
        //if cards are same
            if (card1.getNum()==card2.getNum()){ //getNum is supposed to return the number on the card
        System.out.println("WAR!  Cards, "+card1.toString()+" Match.");
            }
            //if player 1 card is higher
            else if (card1.getNum()>card2.getNum()){
                System.out.println("Player 1 wins the round with "+card1.toString());
                p1score+=1;
            }
            //if player 2 card is higher
            else {
                System.out.println("Player 2 wins the round with "+card2.toString());
                p2score+=1;
            }
           System.out.println("Score: P1 = "+p1score);
           System.out.println("Score: P2 = "+p2score);
        }
            
    

}//end class