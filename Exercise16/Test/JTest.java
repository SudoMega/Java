import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTest {

	Card[] cards = Card.makeDeck();
	Card card = new Card(12, 2);
	Card card2 = new Card(11, 2);
	Card card3 = new Card(10, 2);
	Card card4 = new Card(9, 2);
	Card card5 = new Card(4, 2);

	@Test
	void testCompareTo() {
			
		assertEquals(1,card.compareTo(cards[3]));
		assertEquals(1,card.compareTo(cards[9]));
		
		}
	@Test
	void TestSuitHist() {
		
		int[] result = new int[4];
		assertArrayEquals(result,Card.suitHist(cards));
		
	}
	
	@Test
	void TestHasFlush() {
		

		Card[] mano = {card,card2,card3,card4,card5};
		boolean x = Card.hasFlush(mano);
		assertEquals(true,x);
		
	}
	
	@Test
	void TestIndexLowest() {
		

		assertEquals(6, 6);
			
	}
	@Test
	void TestSelectionSort() {
		
	
	}
}
