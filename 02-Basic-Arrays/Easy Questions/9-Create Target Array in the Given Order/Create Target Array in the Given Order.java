class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] targetArray = new int[nums.length];
        Arrays.fill(targetArray, -1);
        for(int i=0 ; i< nums.length ; i++){
            if(targetArray[index[i]] == -1){
                targetArray[index[i]] = nums[i];
            }
            else if(targetArray[index[i]+1] == -1){
                targetArray[index[i]+1] = targetArray[index[i]];
                targetArray[index[i]] = nums[i];
            }
            else{
                shiftArray(targetArray,index[i],i);
                targetArray[index[i]] = nums[i];
            }
        }

        return targetArray;        
    }

    public static void shiftArray(int [] arr, int start, int end){
        for(int i= end-1; i>=start ; i--){
            arr[i+1] = arr[i];
        }
    }
}
