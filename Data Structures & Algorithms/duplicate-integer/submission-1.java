// import 'HashSet' data structure from Java Utility class
// import java.util.HashSet;
// import java.util.Collections.addAll;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create an empty Set container (no duplicates)
        HashSet<Integer> numbers = new HashSet<Integer>();

        int i = 0;
        while(i<nums.length){
            numbers.add(nums[i]);
            ++i;
        }

        if(numbers.size() < nums.length){
            return true;
        }
        return false;
    }
}