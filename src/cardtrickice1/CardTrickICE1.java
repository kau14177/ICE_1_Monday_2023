/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrickice1;

/**Step 1:- generate 7 random card and store in array
 * Step 2 :- Take any card input from user suit, number.
 * Step 3 :- u\USer card is in the array 'card is found ' 
 * @author battu
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Card[] magicHand = new Card[7];   //Array of object
     for( int i=0;i<magicHand.length;i++)
     {
        Card c1 = new Card();
        c1.setValue();     //Use a method to generate random *13
        c1.setSuits();    //random method suit

     }
       //Step 2:- take input
       
       //Step 3:- match with array content 
    }
    
}
