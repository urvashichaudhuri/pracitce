package com.practice.arrays;

/*Largest Number At Least Twice of Others
Go to Discuss
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.

Example 1:

Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.


Example 2:

Input: nums = [1, 2, 3, 4]
Output: -1
Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


Note:

nums will have a length in the range [1, 50].
Every nums[i] will be an integer in the range [0, 99].*/

public class DominantIndex {
	
	public static void main(String[] args) {
		DominantIndex dominantIndex = new DominantIndex();
		int[] nums = {3, 6, 1, 0};
		int result = dominantIndex.dominantIndex(nums);
		System.out.println("Result: "+result);
	}
	
	public int dominantIndex(int[] nums) {
		int index=0; int highestNumber=0;
		boolean dominantIndexExists = true;
		//find highest number and index in array
		for(int i=0; i<nums.length; i++) {
			if(highestNumber < nums[i]) {
				highestNumber = nums[i];
				index = i;
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(i != index) {
				int xTwice = nums[i] * 2;
				System.out.println("xTwice: "+xTwice);
				if(xTwice > highestNumber) {
					dominantIndexExists = false;
					break;
				}
			}
		}
		System.out.println("HighestNumber: "+highestNumber);
		System.out.println("Index: "+index);
		return dominantIndexExists ? index : -1;
	}

}
