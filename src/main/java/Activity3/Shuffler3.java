
package Activity3;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler3 {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		int mid = (values.length/2);
		int[] newArr = new int[values.length];
		int index =0;
		
		for(int i=0;i<mid;i++)
		{
			newArr[index]=values[i];
			index++;
			newArr[index]=values[mid+i];
			index++;
		}
		for(int i=0;i<values.length;i++)
		{
			values[i]=newArr[i];
		}
		
		
	
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for(int i = values.length-1;i>0;i--)
		{
			int pos = (int) (Math.random()*(i+1));
			int temp = values[pos];
			values[pos] = values[i];
			values[i]=temp;
		}
	}
	public static String flip()
	{
	    if(Math.random()<2.0/3.0)
	    {
	         return "heads";
	    }
	    else
	    {
	        return "tails";
	    }
	}
	public static boolean arePermutations(int[] a, int[]b)
	{
		 if (a.length != b.length) {
		        return false;
		    }

//first I sorted through both the arrays using selection sort	
		    for (int i = 0; i < a.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < a.length; j++) {
		            if (a[j] < a[minIndex]) {
		                minIndex = j;
		            }
		        }
		        int temp = a[i];
		        a[i] = a[minIndex];
		        a[minIndex] = temp;
		    }

	//sorted through second array
		    for (int i = 0; i < b.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < b.length; j++) {
		            if (b[j] < b[minIndex]) {
		                minIndex = j;
		            }
		        }
		        int temp = b[i];
		        b[i] = b[minIndex];
		        b[minIndex] = temp;
		    }
//compared the elements in the two arrays
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] != b[i]) {
		            return false;
		        }
		    }

		    return true;

	}

	

	
}
