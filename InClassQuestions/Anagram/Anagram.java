import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();
        String s2 = in.readLine().trim();

        System.out.println(isAnagram(s,s2));
       
    }

  //this function is case sensitive
    public static boolean isAnagram(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        char []str1_ch = str1.toCharArray();
        char []str2_ch = str2.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(str1_ch);
        Arrays.sort(str2_ch);
 
        for(int i=0; i<str2.length() ; i++){
            if(str1_ch[i] != str2_ch[i]){
                return false;
            }
        }
        return true;        
    }
}
