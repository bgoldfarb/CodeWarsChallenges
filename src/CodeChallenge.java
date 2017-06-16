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
        System.out.println(theEnd("Brian", false));
        System.out.println(withouEnd2("Coolbeans"));
        System.out.println(withouEnd2("ab"));
        System.out.println(middleTwo("hi"));
        System.out.println(repeatSeparator("This", "And", 2));

        
        
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
    	  
    	 /* Given a string, return a string length 1 from its front, unless front is false,
    	  * in which case return a string length 1 from its back. The string will be non-empty.

    			  theEnd("Hello", true) → "H"
    			  theEnd("Hello", false) → "o"
    			  theEnd("oh", true) → "o"*/
    	  
    	  public static String theEnd(String str, boolean front) {
    		  String toReturn = "";
    		  if(front == true){toReturn = str.substring(0,1);}
    		  else{
    			  toReturn = str.substring(str.length()-1, str.length());
    		  }
    		  
    		  
    		  
    		  return toReturn;
    	  }
    	  
/*Given a string, return a version without both the first and 
 * last char of the string. The string may be any length,
 *  including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""*/

    	  public static String withouEnd2(String str) {
    		  String toReturn = "";
    		  int length = str.length();
    		  if(length < 3){
    			  toReturn = "";
    		  }
    		  else{
    			  toReturn = str.substring(1, length-1);
    		  }
    		  return toReturn;
    	  }
    	  
 /*
Given a string of even length, return a string made of the
 middle two chars, so the string "string" yields "ri". 
 The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/   	  
    	  
    	  public static String middleTwo(String str) {
    		  String toReturn = "";
    		  int length = str.length();
    			  toReturn += str.charAt(length/2-1) + "";
    			  toReturn += str.charAt(length/2) + "";
    			  return toReturn;
    		  
    	  }
    	  
/*
Given two strings, word and a separator sep, return a big
string made of count occurrences of the word, separated by the 
separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"*/
    	  public static String repeatSeparator(String word, String sep, int count) {
    		  String toReturn = word;
    		  if(count==0){
    			  return "";
    		  }
    		  for(int i=1;i<count;i++){
    			  toReturn += sep;
    			  toReturn += word;

    		  }
    		  return toReturn;
    		  }
    	  
    	
    /*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
*/
public List<Integer> doubling(List<Integer> nums) {
	   nums.replaceAll(n -> n * 2);
	   return nums;
	}

}