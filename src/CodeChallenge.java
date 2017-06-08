import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*Given an integer, N , print its first 10 multiples. Each 
 * multiple N*i should be printed on a new line in the form: N x i = result.
 */
public class CodeChallenge {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i = 1; i < 11; i++){
            System.out.println(N + " x " + i + " = " + (N*i));
        }
        */
        System.out.println(getMiddle("test"));
        
        
    }
    
    
    
    /*You are going to be given a word. Your job is to return the middle character 
     * of the word. If the word's length is odd, return the middle character.
     *  If the word's length is even, return the middle 2 characters.
     *  Kata.getMiddle("middle") should return "dd"
     */
    	  public  static String getMiddle(String word) {
    		  String toReturn = "";
    		  int wordLength = word.length();
    		  if (wordLength % 2 != 0){
    			  int halfWord = wordLength/2;
    			  char middleLetter = word.charAt(halfWord);
    			  toReturn = ""+middleLetter; 
    		  }
    		  else{
    			  int halfWord = wordLength/2;
    			  char middleLetter = word.charAt(halfWord-1);
    			  char nextMiddle = word.charAt(halfWord);
    			  toReturn = ""+middleLetter + nextMiddle; 
    			  
    		  }
    		  
    		  return toReturn;
    				  
    	  }
    	}
    

