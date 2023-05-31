/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Card suit(Hearts,Diamonds,Spades,Clubs)");
        String suit = scan.nextLine();
        
        System.out.println("Enter a Card value from 1-13");
        int value= scan.nextInt();
        
        Card userCard= new Card();
        userCard.setSuit(suit);
        userCard.setValue(value);
        
        boolean search = false;
        for(int i=0;i<magicHand.length;i++){
            if(userCard.equals(magicHand[i])){
                search = true;
                break;
            }
        }
        
        
        if(search == true){
            System.out.println("You Win");
        }
        else{
            System.out.println("You lose");
        }
    }
    
}
