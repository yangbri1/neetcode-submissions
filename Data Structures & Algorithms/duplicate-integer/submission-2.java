// import java.util.Arrays;
// import 'Set' & 'HashSet' from Java 'Collections' framework 
// import java.util.Set;
// import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a 'Set' reference type in anticipation to convert the given 'nums' ary to 'Set' later down the road ... 
        // Side Note: Use of generics <> for type safety --- aka make sure inputted value is of 'Integer' type (wrapper class of 'int')
        Set<Integer> dupeCheck = new HashSet<Integer>();
        // iterate via each elem in 'nums' ...
        for(int i = 0; i < nums.length; ++i){
            // if()
            // attempt to '.add()' current 'int' value into 'dupeCheck' Set ...
            // ... if already presented within the Set, it should not be added
            dupeCheck.add(nums[i]);
        }
        // if the 'nums' ary length > set size ...
        if(nums.length > dupeCheck.size()){
            // ... some duplicate elems were detected & NOT inputted
            return true;
        }
        // otw ... all elems were unique & no dupes
        return false;


    }
}