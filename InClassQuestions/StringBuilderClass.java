//26 November 2022
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args)throws IOException{

        StringBuilder sb = new StringBuilder("hey there!!");
        sb.insert(2,'a');
        System.out.println(sb);

        System.out.println("Reverse String: "+reverseStringUsingStringBuilder("Mickey"));
        System.out.println("Odd places Character: "+oddCharacterInString("aeroplanes"));

        System.out.println("Last word in string: "+lastWordInString("hey there Minnie"));

        System.out.print("HighestFrequency in String: "+highestFrequencyCharInString("Goofey"));
       
         
    }

    public static String reverseStringUsingStringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        for(int i= str.length()-1 ; i>=0 ; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    //print odd places character in a string ex: aeroplanes op: eolns
    public static String oddCharacterInString(String str){
        StringBuilder sb = new StringBuilder();
        // for(int i=0; i<str.length() ; i++){
        //     if(i%2 != 0)
        //         sb.append(str.charAt(i));
        // }// TC =O(n)  SC = O(n)
        int i=1;
        while(i<str.length()){
            sb.append(str.charAt(i));
            i +=2;
        }// TC =O(n/2)  SC = O(n/2)--for string builder

        return sb.toString();
    }

    //last word in string
    /*  Ip: hey there Mickey
        Op: Mickey is the last string
    */
    public static String lastWordInString(String str){

        // String [] strCh = str.trim().split(" "); //TC=O(n)  SC=O(n)   tc depends on split()which is O(n)
        // return strCh[strCh.length-1];

        StringBuilder sb = new StringBuilder();
        int i = str.length()-1;
        char ch = str.charAt(i);
        while(ch != ' '){
            sb.insert(0,ch);
            i--;
            ch = str.charAt(i);

        }
        return sb.toString(); //this solution will take less time ans space as well
    }

    //find the highest frequency of character in a string
    public static char highestFrequencyCharInString(String str){
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
