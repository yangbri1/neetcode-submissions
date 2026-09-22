class Solution {
    public int[] twoSum(int[] nums, int target) {
        // initialize an int array of size 2
        int[] sumAry = new int[2];

        // iterate thru 'nums' starting at index 1
        int i = 0;
        while(i < nums.length){
            // iterate via 'nums' starting position at index 2
            int j = i + 1;
            while(j < nums.length){
                // calculate the sum from index i & index j
                if(nums[i] + nums[j] == target){
                    sumAry[0] = i;
                    sumAry[1] = j;
                }
                // increment by 1 to keep inner loop going
                ++j;
            }
            // increment by 1 to keep outer loop running
            ++i;
        }
        // return array containing indices of two int adding up to target
        return sumAry;
    }
}
