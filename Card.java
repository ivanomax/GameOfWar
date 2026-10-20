/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author chris mergelos
 */
public abstract class Card {
    //default modifier for child classes

    //taken from prof's example 
    public enum Suit
   {
       HEARTS, CLUBS,SPADES, DIAMONDS
   }
   public enum Value
   {
       ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING,
		JACJ
   }
    private Value value;
    private Suit suit;
    
    public Card(Value v, Suit s)
    {
        value = v;
        suit = s;
    }
    
    //added method
    //turning the word values into numerical
    public int getNum(){
        switch (value){
            case ACE:
                return 14;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 11;
            case QUEEN:
                return 12;
            case KING:
                return 13;
            default:
                return 0;  
        }
    }
    
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}

