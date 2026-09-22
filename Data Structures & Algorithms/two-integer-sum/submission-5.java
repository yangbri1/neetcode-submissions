class Solution {
    public int[] twoSum(int[] nums, int target) {
        // initialize an 'int' ary of size 2 to contain the indices of which adds up to 'target' value
        int[] sumOfTwo = new int[2];
        // System.out.println("Hello World!");

        // int numOne = 0;
        // int numTwo = 0;
        
        /* Duly noted: Below works with the assumption of the given 'nums' int ary is already in ascending order ... otw will need to sort w/ possibly built-in Arrays.sort() method,
        ** Splice ary to truncate large inputs?
        */

        // external loop iterates through each of the elems in 'nums' ...
        for(int i = 0; i < nums.length - 1; ++i){
            // System.out.println(i);
            // ... excluding the selected elem, iterate through the rest ...
            for(int j = i + 1; j < nums.length; ++j){
                // System.out.println(j);
                // if the selected elem & current iterated elem adds up to 'target' ...
                if(nums[i] + nums[j] == target){
                    // re-initialize the 2 indices of the empty ary w/ them in asc order 
                    sumOfTwo[0] = i;
                    sumOfTwo[1] = j;
                }

            }
            // if(nums[i] + nums[i+1] == target){
            //     if(nums[i+1] <= nums.length){
            //         // sumOfTwo[0] = i;
            //         // sumOfTwo[1] = i + 1;
            //         numOne = i;
            //         numTwo = i + 1;
            //     } 
            // }
        }
        // sumOfTwo[0] = numOne;
        // sumOfTwo[1] = numTwo;
        // return ary w/ wanted outputs
        return sumOfTwo;
    }
}
