class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // int total = nums1.length + nums2.length;
        int[] arr = mergerArray(nums1,nums2);
        if((arr.length & 1) == 1){
            //odd
            int mid = arr.length/2;
            return (double)(arr[mid]);
        }
        else{
            //even
            int mid = arr.length/2;

            return ((double)(arr[mid]+arr[mid-1])/2);
        }
        
    }
    public static int[] mergerArray(int[] nums1, int[] nums2){
        int [] arr = new int[(nums1.length+nums2.length)];
        int i=0,j=0,k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            arr[k] = nums1[i];
                i++;
                k++;
        }
        while(j<nums2.length){
            arr[k] = nums2[j];
                j++;
                k++;
        }
        return arr;
    }
}
