// import Java 'Arrays' library in order to utilize built-in 'Arrays.sort()' method
// import java.util.Arrays;

class Solution {
    // 'isAnagram()' method takes in 'String' s & t ...
    // ... checks if they are anagrams (contains same char, same amount of time) of one another 
    // ... if so return true otw false
    public boolean isAnagram(String s, String t) {

        // base case check if the length() of s != t then it could NOT possibly be anagrams ...
        // if(s.length() != t.length()){
        //     return false;
        // }

        // convert given String literals 's' & 't' into respective char arrays ...
        char[] sCharAry = s.toCharArray();
        char[] tCharAry = t.toCharArray();

        // make use of .sort() method from 'Arrays' library to sort the char arrays in place ...
        Arrays.sort(sCharAry);
        Arrays.sort(tCharAry);

        // revert the char arrays for String 's' & 't' to 'String' objs ...
        // Aside: String constructor way ...
        String sSorted = new String(sCharAry);
        String tSorted = new String(tCharAry);

        // Aside: 'String.valueOf()'' method way which is null safe ...
        // ... in creating String obj
        // String sSortedVal = String.valueOf(sCharAry);
        // String tSortedVal = String.valueOf(tCharAry);
        
        // Aside: String concatenation way to convert from char[] -> STring
        // String sSortedConcat = sCharAry + "";
        // String tSortedConcat = tCharAry + "";

        // if the actual value inside 'sSorted' & 'tSorted' are equal ...
        // if(sSorted.equals(tSorted)){
        //     // output true
        //     return true;    
        // }
        // // otw ... output false
        // return false;

        // '.intern()' method essentialy converts the String objs into String literals ...
        // ... aka now in the String Pool & able to use '==' equality operator for comparison
        if(sSorted.intern() == tSorted.intern()){
            return true;
        }
        return false;
    }
}
