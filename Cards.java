class Cards1 {
	
	int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	public String getSuit(int sequence) {
		String[] suite = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
		return suite[sequence / 13];
	}
	public char getPip(int sequence) {
		char[] pip = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 't', 'J', 'Q', 'K'};
		return pip[sequence % 13];
	}
	
	//public static char cardGeneration() {
	//	int randnum;
	//	randnum = 1 + (int)(Math.random() * 13);
		//return pip[randnum];
	//}
}
public class Cards {
	public static void main(String[] args) {
		int sequence = 43;
		Cards1 c = new Cards1();
		System.out.println(c.getSuit(sequence));
		System.out.println(c.getPip(sequence));
	}
}
