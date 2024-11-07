package com.interviewprep.leetcode.easy.maxconsecutiveones;

public class FirstApproach {

	public static void main(String[] args) {
		
		int[] nums = {1,1,0,1,1,1};
		
		FirstApproach fa = new FirstApproach();
		int max = fa.findMaxConsecutiveOnes(nums);

		System.out.println(max);
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        
		int max = 0;
		
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			
			// keep count of consecutive 1s
			if(nums[i] == 1) {
				
				count = count+1;
			}
			
			// reset count if 0 is encountered
			if(nums[i] == 0) {
				
				count = 0;
							
			}
			
			// update max
			max = Math.max(max, count);
		}
		
		return max;
    }

}
