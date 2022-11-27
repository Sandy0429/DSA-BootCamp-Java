import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();
       
        //System.out.println((int)'a'); op :- 97
        //System.out.println((int)'A'); // op:- 65
        System.out.print(highestFrequencyCharacterInString(s));

    }
    //Counting frequency using Arrays(highest frequency in character)
    public static char highestFrequencyCharacterInString(String str){
        //code for lower case alphabet
        int [] charMapFrequency = new int [26];        
        
        for(int i=0 ;i<str.length() ; i++){
            char ch = str.charAt(i);
            charMapFrequency[ch-'a']++;
        }
        int max = charMapFrequency[0];
        int index =0;
        for(int i=1 ; i<26 ; i++){
            if(charMapFrequency[i]>max){
                max = charMapFrequency[i];
                index=i;
            }
        }

        return (char)('a'+index);

    }

    
}
