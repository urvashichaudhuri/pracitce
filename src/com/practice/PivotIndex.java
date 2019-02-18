package com.practice;

public class PivotIndex {

	public static void main(String[] args) {
		int a0[] = {1, 7, 3, 6, 5, 6};
        int len = a0.length;
        int index = 1, leftsum=0, rightsum=0;
        boolean pivotIndexExists = false;
        while(index <= len) {
        	leftsum = 0; rightsum = 0;
        	for(int i=index+1; i<len; i++){
                rightsum += a0[i];
            }
            for(int i=index-1; i>=0; i--){
                leftsum += a0[i];
            }
            System.out.println("rightsum:"+rightsum);
            System.out.println("leftsum:"+leftsum);
            if(leftsum != 0 && rightsum == leftsum) {
            	pivotIndexExists = true;
            	break;
            }
            index++;
        }
        if(pivotIndexExists) {
        	System.out.println(index);
        }else {
        	System.out.println(-1);
        }
	}
	
}
