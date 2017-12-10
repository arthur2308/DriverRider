import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        int length = words.length;
        List<List<Integer>> retVal = new ArrayList<>();
        if (length == 0) return retVal;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                //check if palindrome, add to list
                if (isPalindrome(words[i].concat(words[j])) && i != j){
                    //add to the list
                    System.out.println(i + " " + j);
                    if (isPalindrome(words[j].concat(words[i])))
                        System.out.println(j + " " + i);
                }
            }
        }
        return retVal;
    }

    //returns true if a string is a palindrome
    private Boolean isPalindrome(String word) {
        int length = word.length();
        //check
        for (int i = 0; i < length/2; i++) {
            if (word.charAt(i) != (word.charAt(length -i - 1)))
                return false;
        }
        return true;
    }
}
