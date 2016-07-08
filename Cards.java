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
 	 
}
class Rummy{
public ArrayList<Integer> sortedHand(ArrayList<Integer> hand) {
 	         Collections.sort(hand);
 	   return hand;
	 }
public boolean findLife(ArrayList<Integer> hand){
	return true;
}
public int findSet(ArrayList<Integer> hand) {
	int count=0;
       for (int i = 0; i < hand.size(); i++) {
        for (int j=i+1;j<hand.size();j++){
			if((hand.get(i)%13)==(hand.get(j)%13))
				count++;
		}

    }
	if(count>=3)
	return count;
	else 
	return 0;
    }
    
}

public class Cards {
	public static void main(String[] args) {
		int seq1 = 43;
		int seq2 = 47;
		ArrayList<Integer> hand = new ArrayList<Integer>();
		hand.add(2);
		hand.add(5);
		hand.add(38);
		hand.add(42);
		Card c = new Card();
		
		Rummy r  = new Rummy();
		//System.out.println(c.getSuit(seq1));
		//System.out.println(c.getPip(seq2));
		//System.out.println(c.compare(seq1,seq2));
		System.out.println(r.sortedHand(hand));
		System.out.println(r.findSet(hand));
	}
}
