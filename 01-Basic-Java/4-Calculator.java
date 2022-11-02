import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        if(operator == '+')
            System.out.print("Sum is "+ (a+b)); 
        else if(operator == '-')
            System.out.print("Difference is "+ (a-b)); 
        else if(operator == '*')
            System.out.print("Multiplication is "+ (a*b)); 
        else if(operator == '/')
            System.out.print("Division is "+ (a/b));        
    }
}
