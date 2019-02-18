package com.practice;

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
