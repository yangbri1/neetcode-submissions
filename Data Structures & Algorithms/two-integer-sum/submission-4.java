class Solution {
    public int[] twoSum(int[] nums, int target) {
        // initialize an 'int' ary of size 2 to contain the indices of which adds up to 'target' value
        int[] sumOfTwo = new int[2];
        // System.out.println("Hello World!");

        int numOne = 0;
        int numTwo = 0;

        // external loop iterates through each of the elems in 'nums' ...
        for(int i = 0; i < nums.length - 1; ++i){
            // System.out.println(i);
            for(int j = i + 1; j < nums.length; ++j){
                // System.out.println(j);
                if(nums[i] + nums[j] == target){
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
        return sumOfTwo;
    }
}
