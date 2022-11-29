//29 November 2022
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args){
        //define Arraylist
        ArrayList<Integer> a1 = new ArrayList<>();

        //adding values in ArrayList
        a1.add(12);
        a1.add(24);

        //print ArrayList
        System.out.println(a1);//op -> [12, 24]

        // how to get the values of ArrayList
        int a = a1.get(0);
        System.out.println(a);
        int b = a1.get(1);
        System.out.println(b);
        
        //removing elements from ArrayList
        a1.add(100);
        System.out.println(a1);
        a1.remove(2);//index
        System.out.println(a1);

        //set the value at a particular index
        a1.set(1,29);
         System.out.println(a1);//[12, 24]->[12, 29]

         //--sorting array ArrayList
         a1.add(1);
         a1.add(5);
         a1.add(3);
         a1.add(90);
         a1.add(18);
         System.out.println(a1);
         a1.sort((c,d) -> c-d);//sort in ascending order
         System.out.println(a1);
         a1.sort((c,d) -> d-c);//sort in descending order
         System.out.println(a1);

         System.out.println("Sum of all elements of ArrayList is ="+sumOfElements(a1));
         System.out.println("pascal Triangle elements = "+pascalTriangleUsingArrayList(5));
         
    }

    public static int sumOfElements(ArrayList<Integer> a1){
        int sum =0;
        for(int a : a1) //-> for(int i=0 ; i<a1.size(); i++) sum += a1.get(i);
            sum += a;
        return sum;
    }// Time complexity - O(n) ; Space Complexity - O(1)

    public static ArrayList<Integer> pascalTriangleUsingArrayList(int numRows) {
        ArrayList<ArrayList<Integer>> all_rows = new ArrayList<List<Integer>>(); //result
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<numRows; i++) {
            row.add(0, 1); //add element 1 at index 0.

            //now iterate the row, keep adding elements in pair, starting from j=1,
            // and set the sum at index j
            for(int j=1; j<row.size()-1; j++)
                row.set(j, row.get(j)+row.get(j+1));

            //create a copy of row and store it in all_rows
            all_rows.add(new ArrayList<Integer>(row));
        }
        return row;
    }
}
/*
int -> Integer class
char -> Character class
boolean -> Boolean class

Memory is allocated in Heap are for the Array in Java.
 In Java reference types are stored in the Heap area. 
 As arrays are also reference types, (they can be created using the “new” keyword) 
 they are also stored in the Heap area.

*/

/*Op:
[12, 24]
12
24
[12, 24, 100]
[12, 24]
[12, 29]
[12, 29, 1, 5, 3, 90, 18]
[1, 3, 5, 12, 18, 29, 90]
[90, 29, 18, 12, 5, 3, 1]
Sum of all elements of ArrayList is =158
pascal Triangle[1, 4, 6, 4, 1]
*/
