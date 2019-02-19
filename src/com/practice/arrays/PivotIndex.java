package com.practice.arrays;

/*In a given integer array nums, there is always exactly one largest element.

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

public class PivotIndex {

	public static void main(String[] args) {
		PivotIndex pivotIndex = new PivotIndex();
		int[] nums = {1,2,3};
		int result = pivotIndex.pivotIndex(nums);
		System.out.println("Result: "+result);
	}
	
	public int pivotIndex(int[] nums) {
        int len = nums.length;
        int index = 0, leftsum, rightsum;
        boolean pivotIndexExists = false;
        while(index < len) {
        	leftsum = 0; rightsum = 0;
        	for(int i=index+1; i<len; i++){
                rightsum += nums[i];
            }
            for(int i=index-1; i>=0; i--){
                leftsum += nums[i];
            }
            System.out.println("rightsum:"+rightsum);
            System.out.println("leftsum:"+leftsum);
            if(rightsum == leftsum) {
            	pivotIndexExists = true;
            	break;
            }
            index++;
        }
        return pivotIndexExists ? index : -1;
    }
	
}
