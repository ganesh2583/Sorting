/**
 * 
 * SelectionSort program demonstrates Sorting of a List of numbers.
 * 
 * Selection Sorting is one of the basic Sorting Algorithms.
 * 
 * Time Complexity = O(n*n)
 * 
 * Below are the steps:
 * 1. We take the array as input and move the least valued element to the beginning of the the array.
 * 2. We then iterate through the array excluding the first element, and repeat the above step till we remain with last element.
 * 
 * Code Explanation:
 * We loop through the array of numbers. To Set the initial base index as the first element. 
 * We create another loop, with base index + 1 value and compare the rest values in the rest of the array with value in 
 * base index.
 * If we find any value less that our base element, then we swap elements. This makes sure the least possible value
 * is always in the base index.
 * In the  first for loop we increment the base index.
 * 
 * 
 * @author Ganesh Chaitanya Kale
 *
 */
public class SelectionSort {
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = {2,1,4,12,7,13,1};
		selectionSort(numbers);
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
	private static int[] selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length-1; i++) {
			int minElementIndex = i;
			for (int j = i +1; j < numbers.length; j++) {
				if(numbers[j] < numbers[i]) {
					minElementIndex = j;
				}
			}
			int tempNumber = numbers[minElementIndex];
			numbers[minElementIndex] = numbers[i];
			numbers[i] = tempNumber;
		}
		return numbers;
	}

}
