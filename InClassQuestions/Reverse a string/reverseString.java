import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();
        String rs = reverseString(s);
        System.out.println(rs);

    }
    public static String reverseString(String str){
        String s="";
        for(int i=str.length()-1 ; i>=0 ; i--){
            s += str.charAt(i);
        }

        return s;

    }
}
