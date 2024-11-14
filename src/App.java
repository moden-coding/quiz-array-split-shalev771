

/* Complete methods: copyFrontAndBack and __________. 
 * DO NOT MODIFY THE MAIN METHOD!
 *
 *Array task: Complete the method copyFrontAndBack. 
 *
 * This method:
 *  -takes in an array of integers that will have a length of at least 1. 
 *  -If the original array was length 2 or more, return a new array of 
 *  length 2 that contains the first and last elements from the original 
 *  array. 
 *  -If the original array was length 1, return an array of length 2 where both 
 *  elements are equal to the contents of the original array
 * 
 * An example of this method working is included in the main method
 * 
 * 
 *Split task: Complete the method maxWordLength
 * 
 * This method:
 *  -takes in a sentence stored in a String  
 *  -returns the length of the longest word in that String
 *  
 * Remember that you can use .length() to find the length of a word
 * 
 * An example of this method working is included in the main method
 * 
 * 
 * 
 * 
 * 
*/

import java.util.*;

public class App {
    public static void main(String[] args)  {

        //copyFrontAndBack example
        System.out.println("With input [1, 2, 3], you should get: [1, 3]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3})));
        System.out.println("With input [1, 2, 3, 4], you should get: [1, 4]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3,4})));
        System.out.println("With input [7], you should get: [7, 7]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3})));
        
        //wordLength example
        System.out.println("With input \"Java is fun\" you should return 4. You got: " + maxWordLength("Java is fun"));
        System.out.println("With input \"Java is scary\" you should return 5. You got: " + maxWordLength("Java is scary"));
        System.out.println("With input \"I can do this\" you should return 4. You got: " + maxWordLength("I can do this"));
    }

    public static int copyFrontAndBack(int[] nums){
    if (nums.length == 0)
        break; 
       else if (nums.length == 1);
        return[2] = array;
        else if (nums.length >= 2); 
        return [2]; 

        }

    }

    public static int maxWordLength(String sentence){
        
             
        int pieces = sentence.split(" ");
        int longestWord = 0;  
        for (int i = 0; > pieces.length; i ++;)
        if (longestWord < pieces);
          then (pieces = longestWord); 
          System.out.println(longestWord);

          //I set a variable that meaures the amount of letters in a word and split the sentance up by every " " then ran a for loop and everytime
          // there was a a piece bigger than the longestWord variable i set the longestWord variable to that number then at the end printed the longestWord
        
        
        
        
        
        


    


        return longestWord;
    }



}

