import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));

    }

    public static int sum(int n){

        // int add =0;
        // if(n !=0){
        //     add  = n +sum(n-1); 
        // }        
        // return add;        

        if( n == 0)
            return 0;
        else 
            return n + sum(n-1);

    }
}
