class Solution {
    public boolean hasDuplicate(int[] nums) {
        // sort array of int 'nums' if it isn't already
        Arrays.sort(nums);
        // initialize 'dupBool' variable w/ a default boolean value
        boolean dupBool = false;
        // iterate through array of int -- start at iterator i = 1 to not get NullPointerException from going out of bounds
        for(int i = 1; i < nums.length; ++i){
            // start w/ index i-1 to include index 0
            if(nums[i-1] == nums[i]){
                // if pair of same values found right next to each indexes -- return true
                dupBool = true;
            }
        }
        // otherwise return default falsy value
        return dupBool;
    }
}
