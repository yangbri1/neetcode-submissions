class Solution {
    public boolean isAnagram(String s, String t) {
        boolean defBool = false;
        // initial check to see if String 's' & 't' are of same length ...
        // if not they can't be anagrams of each other as by definition anagrams are string containg exact same characters & number of characters
        if(s.length() != t.length()){
            // defBool = false;
            // System.out.println(s.length() + " " + t.length());
            return false;
        }

        // if either 's' or 't' is an empty String -- edge case
        if(s.length() == 0 || t.length() == 0){
            return false;
        }

        // apply String.split() method to split String into array of char -- works but not efficient
        // String[] charAryS = s.split("");
        // String[] charAryT = t.split("");

        // apply built-in String.toCharArray() method
        char[] charAryS = s.toCharArray();
        char[] charAryT = t.toCharArray();

        // implement Arrays.sort() method from java.util.* package
        Arrays.sort(charAryS);
        Arrays.sort(charAryT);

        // apparently there's an Arrays.equals() method too like String .equals() method
        return Arrays.equals(charAryS, charAryT);   // true if so, false otw

        // could loop & append each individual 'char' elem into these empty Strings ...
        // String sNew = "";
        // String tNew = "";

        // for(int i = 0; i < charAryS.length; ++i){
        //     sNew += charAryS[i];
        //     tNew += charAryT[i];
        // }

        // if 'sNew' == 'tNew'
        // if(sNew.equals(tNew)){
        //     // defBool = true;
        //     return true;
        // }
        // otw if not ...
        // return false;

    }
}
