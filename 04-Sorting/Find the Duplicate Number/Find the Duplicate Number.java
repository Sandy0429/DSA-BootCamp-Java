class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
		while (i < nums.length) {
			int correct = nums[i]-1;
			if(nums[i] != nums[correct]) {
				swap(nums, i, correct);
			}
			else {
				i++;
			}
		}
		
		i=0;
		while(i< nums.length) {
			if(nums[i] != i+1) {
				return nums[i];
			}
			i++;
		}

		return nums.length;
        
    }
    public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
