class Solution {
    public int firstMissingPositive(int[] nums) {

         int i = 0;
		while (i < nums.length) {
			int correct = nums[i]-1;
			if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} 
			else {
				i++;
			}
		}
		
		i=0;
		while(i< nums.length) {
			if(nums[i] != i+1) {
				return i+1;
			}
			i++;
		}

		return nums.length+1;
        
    }
     public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
