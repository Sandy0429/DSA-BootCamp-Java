import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int []array = new int [sizeOfArray];

        for(int i=0; i< sizeOfArray; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Before reverse "+Arrays.toString(array));

        reverse(array);

        System.out.println("After reverse "+Arrays.toString(array));
    }

    static void reverse(int []arr){
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int []arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
//reversing array using two pointer method
/*
  Input:
    6
    1 2 3 4 5 6
  
  Output:
    Before reverse [1, 2, 3, 4, 5, 6]
    After reverse [6, 5, 4, 3, 2, 1]
*/
