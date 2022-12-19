import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
        // Your code here
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int target = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // System.out.print(ceilingOfANumber(arr,n,target));

        int [] arr ={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
        int [] arr1 ={0,1,2,3,4,5,6,7};
        System.out.println(countRotations(arr1));
    }

    public static int countRotations(int []arr){
        int pivot = findPivot(arr);
        
        return pivot+1;
    }
    public static int countRotationsDuplictae(int []arr){
        int pivot = findPivotWithDuplicates(arr);
        
        return pivot+1;
    }

    //using this for non duplicate elements in array
    public static int findPivot(int [] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    //using this when duplicate elements are present in array
    public static int findPivotWithDuplicates(int [] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            //when start mid and end value are same
            if(arr[mid] == arr[start] && arr[mid]== arr[end]){

                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]< arr[end-1]){
                    return end-1;
                }
                end--;
            }

            //left side is sorted,so pivot should be in right
            else if(arr[start]<arr[mid] ||(arr[start]== arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return -1;
      }
}
