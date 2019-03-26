/**
 * 
 * BubbleSort program demonstrates Sorting of a List of numbers.
 * 
 * Bubble Sorting is one of the basic Sorting Algorithms. Since we will bubble out them
 * max element to the last of array in each iteration its called Bubble Sort.
 * 
 * Time Complexity = O(n*n)
 * Best Case scenario = o(n)
 * 
 * Below are the steps:
 * 1. We take the array as input and compare each element with its next element.
 * 2. If the element is greater that its next element, we perform a swap.
 * 3. After the initial iteration of the array is complete, we will have the largest number at the end of the array.
 * 4. Repeat these steps for the rest of the array. 
 * 5. If in an iteration there are no swaps, the array is already sorted. 
 * 
 * Code Explanation:
 * We loop through the array of numbers and compare current element with next element.
 * If the number is greater than next number, we perform Swap.
 * We repeat these steps for iterations to the length of the array.
 * If in an iteration there are no swaps, the array is already sorted. 
 * 
 * @author Ganesh Chaitanya Kale
 *
 */
public class BubbleSort {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = {2,1,4,12,7,13,1};
		bubbleSort(numbers);
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
	private static int[] bubbleSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			boolean swaps = false;
			for (int j = 0; j < numbers.length - i -1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int tempNumber = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tempNumber;
					swaps = true;
				}
			}
			if(!swaps) {
				break;
			}
		}
		return numbers;
	}
}
