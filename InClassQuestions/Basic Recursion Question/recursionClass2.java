import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // printIncreasing(n);
        // System.out.println();
        // printDecresing(n);
        // printDecresingIncreasing(n);
        // printEvenInDecresingIncreasing(n);
        // System.out.print(factorial(n));

        // for (int i = 0; i < n; i++) {
  
        //     System.out.print(fibonacci(i) + " ");
        // }

        System.out.print(power(5, 2));

    }

    public static void printIncreasing(int n){
        /*  Ip: 5
            Op: 1 2 3 4 5
        */
        // if( n > 1)        
        //     printIncreasing(n-1);

        // System.out.print(n+" ");

        //Or
        if(n==0)
            return;

         printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static void printDecresing(int n){
         /*  Ip: 5
            Op: 5 4 3 2 1
        */
        if(n==0)
            return;
        System.out.print(n+" ");
        printDecresing(n-1);
    }

    public static void printDecresingIncreasing(int n){
         /*  Ip: 5
            Op: 5 4 3 2 1 1 2 3 4 5 
        */
        if(n==0)
            return;

        System.out.print(n+" ");
        printDecresingIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static void printEvenInDecresingIncreasing(int n){ //skip odd digits
         /*  Ip: 5
            Op: 5 4 3 2 1 1 2 3 4 5 
        */
        if(n==0)
            return;
        
        if(n%2==0)
        System.out.print(n+" ");

        printEvenInDecresingIncreasing(n-1);

        if(n%2==0)
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        /*  Ip: 5
            Op: 5*4*3*2*1  =120

            0! = 1;//remember this
        */
        if(n==0)
            return 1;
        
        return n*factorial(n-1);

    }

    public static int fibonacci(int n){ //this will give the 'n'th digit fibonacci series value 

        if(n <= 1)
            return n;
        
        return fibonacci(n-1)+fibonacci(n-2);

        
    }

    public static int power(int n, int m){
        /*
            Ip: 5 2
            Op: 25
            Explanation: 5^2 =25
        */

        if(m ==0)
            return 1;
        return n * power(n, m-1);
    }

}
