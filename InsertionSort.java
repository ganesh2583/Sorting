/**
 * 
 * InsertionSort program demonstrates Sorting of a List of numbers.
 * 
 * Insertion Sorting is one of the basic Sorting Algorithms.
 * 
 * Time Complexity = O(n*n)
 * 
 * Below are the steps:
 * 1. We take the array as input and pivot on first element.
 * 2. We compare the next element with the pivot element and if its value is less than previous element, we perform a swap.
 * 3. Repeat it for the rest of the array.
 * 
 * 
 * @author Ganesh Chaitanya Kale
 *
 */
public class InsertionSort {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = {2,1,4,12,7,13,1};
		insertionSort(numbers);
		System.out.println("Sorted Array : ");
		for (int i = 0; i < numbers.length; i++) {
			int j = numbers[i];
			System.out.println(j);
		}
	}
	
	/**
	 * 
	 * This method returns the Sorted Array.
	 * 
	 * @param numbers
	 * @return
	 */
	private static int[] insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int value = numbers[i];
			int index  = i;
			while (index > 0 && value < numbers[index - 1]) {
				numbers[index] = numbers[index-1];
				index--;
			}
			numbers[index] = value;
		}
		return numbers;
	}
}
