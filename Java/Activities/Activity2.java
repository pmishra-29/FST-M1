package activities;

public class Activity2 {

	public static void main(String[] args) {

		// create an object for the class
		Activity2 actObj = new Activity2();

		// create an integer Array of 6 numbers
		int[] nums = { 10, 77, 10, 54, -11, 10 };

		// set the searchNum and the fixedSum
		int searchNum = 10;
		int fixedSum = 30;
		System.out.println("Result : " + actObj.result(nums, searchNum, fixedSum));
	}

	// Find the 10's in the array and add them
	public boolean result(int[] nums, int searchNum, int fixedSum) {
		// temporary variable to hold the calculated sum
		int tempSum = 0;

		// Loop through all the elements of the array to look for 10
		for (int num : nums) {
			// check if num is equal to searchNum
			if (num == searchNum) {
				// Add the value
				tempSum += searchNum;
			}
			// check if tempSum is greater than fixedSum
			if (tempSum > fixedSum) {
				// condition fails, break loop
				break;
			}
		}
		return fixedSum == tempSum;
	}
}
