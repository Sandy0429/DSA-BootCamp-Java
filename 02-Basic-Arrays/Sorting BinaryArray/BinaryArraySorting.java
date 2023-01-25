
import java.util.Arrays;
//import java.util.Scanner;

public class SortBinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		int [] arr = {0,1,1,1,1,1,0,0,0,1,0,0,0};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//1st approach: count 1's
	/* count no. of ones and then start filling the last places of array with 1*/
	
	
	//2nd approach: 2pointer method
	public static void sortArray(int[] arr) {
		int zero = 0;
		int one =arr.length-1;
		
		while(zero < one) {
			if(arr[zero] != 0) {
				if(arr[one] != 1) {
					swap(arr,zero,one);
				}
				else {
					one--;
				}
			}
			else {
				zero++;
			}
		}
		
	}
	public static void swap(int [] arr,int zero, int one) {
		int temp = arr[zero];
		arr[zero]=arr[one];
		arr[one]=temp;
	}

}
