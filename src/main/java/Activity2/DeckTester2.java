package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"king","queen","Ace","Jack"};
		String[] suit1 = {"hearts","diamonds"};

		int[] val1 = {13,12,1,11};
		Deck2 newDeck = new Deck2(suit1, rank1, val1);
		
		System.out.println(newDeck);
		System.out.println(newDeck.deal().toString());
		System.out.println(newDeck.size());
		System.out.println(newDeck.isEmpty());
	}
}
