/*
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1 
0 0 0 0 
0 1 1 1 
0 0 0 0 
0 0 0 1 
0 0 
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());

        while(t>0){
            String [] rowCol = in.readLine().trim().split(" ");
            int row = Integer.parseInt(rowCol[0]);
            int col = Integer.parseInt(rowCol[1]);
            int [][]arr = new int[row][col];
            
            for(int i=0;i<row; i++){
                String[] elements = in.readLine().trim().split(" ");
                short test =0;
                for(int j=0; j<col; j++){
                    arr[i][j] = Integer.parseInt(elements[j]);
                    if(arr[i][j] == 1){
                        System.out.print("1 ");
                        test++;
                    }
                    else if (arr[i][j] == 0){
                        if(test == 0){
                            System.out.print("0 ");
                        }else{
                            System.out.print("1 ");
                        }
                    }                    
                }
                System.out.println();
            }
            t--;
        }
    }
}

/*
Input: 
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1 
0 0 0 0 
0 1 1 1 
0 0 0 0 
0 0 0 1 
0 0 
*/
