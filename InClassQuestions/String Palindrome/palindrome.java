import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();
      
        System.out.print(isPalindrome(s));     

    }

    public static boolean isPalindrome(String str){
        int start=0;
        int end= str.length()-1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
  
}
