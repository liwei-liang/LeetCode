package day2;

public class binarySearch {
    public int search(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length-1;
    	return helper(left, right, nums, target);
    }
    
    public int helper(int left, int right, int[] nums, int target){
    	if(left>right)
    		return -1;
    	if(left == right){
    		if(nums[left] == target)
    			return left;
    		else
    			return -1;
    	}
    	int mid = (left+right)/2;
    	if(nums[mid] == target){
    		return mid;
    	}
    	if(nums[mid] > target){
    		return helper(left,mid-1,nums,target);
    	}
    	if(nums[mid] < target){
    		return helper(mid+1, right, nums, target);
    	}
    	return -1;
    }
}
