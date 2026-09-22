class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);

        int[] sumAry = new int[2];
        // int i = 1;
        // while(i < nums.length){
        //     if(nums[i-1] + nums[i] == target){
        //         sumAry[0] = i-1;
        //         sumAry[1] = i;
        //         // return(sumAry);
        //     }
        //     ++i;
        // }

        // [4, 5, 6]
        int i = 0;
        // 4
        while(i < nums.length){
            // System.out.println("Out" + nums[i]);
            int j = i + 1;
            while(j < nums.length){
                // 4 + 5 != 10
                // 4 + 6 == 10
                // System.out.println(nums[j]);
                if(nums[i] + nums[j] == target){
                    sumAry[0] = i;
                    sumAry[1] = j;
                }
                j++;
            }
            i++;
        }
        return sumAry;
    }
}
