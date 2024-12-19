package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		//create object of the class
		Activity4 actObj = new Activity4();
		// create the unsorted array
		int[] nums = { 4, 9, 5, 3, 8, 2, 1 };
		// print the array before sorting
		System.out.println("The Array Before Sorting is : " + Arrays.toString(nums));
		// call the function to sort the array
		actObj.insertionSort(nums);
		// print the array after sorting
		System.out.println("The Array After Sorting is : " + Arrays.toString(nums));
	}

	public void insertionSort(int[] nums) {
		// set the size of the array
		int size = nums.length;

		// loop through the array
		// starting from the second value
		for (int i = 1; i < size; i++) {
			// set the key value and the first compare value
			int key = nums[i];
			int j = i - 1;

			// check if key is lesser
			// if it is, swap it with the left value
			while (j >= 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				--j;
			}
			// Make the next value the key
			nums[j + 1] = key;
		}
	}
}
