import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class JTest {

	private static final Random random = new Random();
	Deck deck = new Deck();
	@Test
	void testRandomInt() {
			
		int high = 55;
		int low = 10;
		int rand = random.nextInt(Math.max(high,low) - Math.min(high,low) + 1) + low;
		assertEquals(rand,Deck.randomInt(high, low));
		//Son randoms, asi que es muy dificil que sean iguales
		
		}
	@Test
	void TestSwapCards() {
		
		//SwapCards
		deck.swapCards(1,2);
		Deck temp = deck;
		deck.swapCards(1,2);
		assertEquals(temp.cards[1].getSuit(), deck.cards[1].getSuit());
	}
	
	@Test
	void TestShuffle() {
		
		Deck temp = deck;
		temp.shuffle();
		assertEquals(temp.cards[1].getRank(), deck.cards[1].getRank());
		assertEquals(temp.toString(), deck.toString());
			
	}
	
	@Test
	void TestIndexLowest() {
		
		Deck temp = deck;
		int x = temp.indexLowest(6, 22);
		assertEquals(6, x);
			
	}
	@Test
	void TestSelectionSort() {
		
		Deck temp = deck;
		temp.selectionSort();
		assertEquals(temp.toString(), deck.toString());
			
	}
	
	@Test
	void TestMerge() {//debe fallar ya que aumenta el tamaño del deck y retorna uno doble
		
		Deck temp = deck;
		temp.selectionSort();
		temp = temp.merge(deck, deck);
		assertEquals(temp.toString(), deck.toString());
			
	}
	@Test
	void TestMergeSort() {
		
		Deck temp = deck;
		temp.mergeSort();
		assertEquals(temp.cards[1].getRank(), deck.cards[1].getRank());
			
	}
	@Test
	void TestInsertionSort() {
		
		Deck temp = deck;
		temp.insertionSort();
		assertEquals(temp.cards[1].getRank(), deck.cards[1].getRank());
			
	}
	

}
