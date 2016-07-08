import java.util.*;
class Card {
	
	int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	String[] suit = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
	char[] pip = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 't', 'J', 'Q', 'K'};
	public int getSuit(int sequence) {
		return sequence / 13;
	}
	public int getPip(int sequence) {
		return sequence % 13;
	}


	public int compare(int seq1, int seq2){
		int EqualCards = -1;
		if( getPip(seq1) > getPip(seq2) )
			return seq1;
		else if( getPip(seq1) < getPip(seq2))
			return seq2;
		else{
			if( getSuit(seq1) > getSuit(seq2) )
				return seq1;
			else if( getSuit(seq1) < getSuit(seq2))
				return seq2;
			else
				return EqualCards;
		}
	}	
	public void shuffle(ArrayList<Integer> cards){
    	
     		Collections.shuffle(cards);
    	 }
}
 class Player {
 	 public void pickCard(){
 	 }
 	 public void dropCard(int i){
 	 }
 	 public ArrayList<Integer> sortedHand( ArrayList<Integer> hand) {
 	         Collections.sort(hand);
 	   return hand;
 	 }
}

public class Cards {
	public static void main(String[] args) {
		int seq1 = 43;
		int seq2 = 47;
		ArrayList<Integer> hand = new ArrayList<Integer>();
		hand.add(5);
		hand.add(9);
		hand.add(10);
		hand.add(20);
		Card c = new Card();
		Player p  = new Player();
		System.out.println(c.getSuit(seq1));
		System.out.println(c.getPip(seq2));
		System.out.println(c.compare(seq1,seq2));
		System.out.println(p.sortedHand(hand));
	}
}
