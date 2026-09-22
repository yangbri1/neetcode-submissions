// import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // convert given String 's' & 't' into a char arrays
        char[] sCharAry = s.toCharArray();
        char[] tCharAry = t.toCharArray();

        // implement built-in java Arrays.sort() method to sort given String
        Arrays.sort(sCharAry);
        Arrays.sort(tCharAry);

        // convert sorted versions of String 's' & 't' back to String type
        String sSorted = new String(sCharAry);
        String tSorted = new String(tCharAry);

        // employ String .equals() method to check if the values of each String are equivalent (loose comparison)
        if(sSorted.equals(tSorted)){
            return true;
        }
        
        // otw ...
        return false;

    }
}
