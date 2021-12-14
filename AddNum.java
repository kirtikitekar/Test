package com.home;

import java.util.Arrays;

public class AddNum {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int[] result = twoSum(nums, 0);
        System.out.println(Arrays.toString(result));
    }
        private static int[] twoSum(int[] nums, int target)
        {
            int[] returnArr = {-1,-1};
            int numsLength = nums.length;
            if(numsLength == 0)
                return returnArr;

            for(int i=0; i < numsLength-1; i++)
            {
                for(int j=i+1; j < numsLength; j++)
                {
                    if(nums[i] + nums[j] == target)
                    {
                        returnArr[0] = i;
                        returnArr[1]= j;
                        return returnArr;
                    }
                }
            }
            return returnArr;
        }

}
