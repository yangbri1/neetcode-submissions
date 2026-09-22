/*
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
*/

class Solution {
    public boolean isPalindrome(String s) {

        // call upon .replaceAll() method from Java String in order to eliminate all non-alphanumeric char within String 's' (include punctuation)
        // String sCleaned = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();
        String sCleaned = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "");
        // initialize an empty String to append the OG String in reverse fashion
        String sReversed = "";
        // iterate via each 'char' in 'String' s ...
        for(int i = sCleaned.length() - 1; i > -1; --i){
            // append each of the letters in reverse order ...
            // ... Note: This creates a new String obj each time (inefficient)
            sReversed += sCleaned.charAt(i);
        }

        System.out.println(sCleaned);
        System.out.println(sReversed);
        
        // if(sCleaned.equals(sReversed)){
        //     return true;
        // }

        // if(sCleaned.equalsIgnoreCase(sReversed)){
        //     return true;
        // }

        // return false;
        // ternary operator way to check for truthy or falsy value
        return sCleaned.equalsIgnoreCase(sReversed) ? true : false;
        
        // utilize StringBuilder's built-in .reverse() method 
        // String sReversed = new StringBuilder(s).reverse().toString();

        // return()
    }
}
