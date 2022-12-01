//26 November 2022
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args)throws IOException{
        for(int a : pascalTriangle(9)){
            System.out.print(a+" ");
        }         
    }

    public static int[] pascalTriangle(int n){
        n = n-1;
        if(n < 0){
            return new int[0];
        }
        int [] prevArr = new int[1];
        prevArr[0]=1;

        while(n!=0){
            int [] nextRowArray = new int[prevArr.length +1];

            //Filling start and end of the array
            nextRowArray[0]=1;
            nextRowArray[nextRowArray.length-1]=1;

            //Filling middle value
            for(int i=1;i<prevArr.length;i++){
                nextRowArray[i] = prevArr[i]+prevArr[i-1];
            }

            prevArr = nextRowArray;
            n--;
        }
        return prevArr;
    }

   
}

/*
Op:  1 8 28 56 70 56 28 8 1 

*/
