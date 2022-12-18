class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] ans = {-1,-1};   

        ans[0]= search(nums,target,true);//searching for first index
        if(ans[0] != -1){
            ans[1]= search(nums,target,false);//searching for last inde
        }
        return ans;
    }

    public int search(int [] nums, int target, boolean findStartIndex){
        int ans =-1;
        int start =0;
        int end = nums.length-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            
            if(nums[mid] == target){
               
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
            else if(nums[mid]< target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}
