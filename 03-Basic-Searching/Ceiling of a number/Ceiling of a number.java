import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    /*
        Ip: 7 15
            2 3 5 9 14 16 18
        Op: 16
    */

    public static int ceilingOfANumber(int []arr, int n, int target){
        int left =0;
        int right = n-1;
        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return arr[left];
    }
    

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(ceilingOfANumber(arr,n,target));
    }
}
