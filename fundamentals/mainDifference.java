package fundamentals;

import java.util.ArrayList;

public class mainDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int maxDiff = 0;

        for(int i = 0; i < nums.length;i++){
            if(i == nums.length-1){
                maxDiff = Math.max(maxDiff,Math.abs(nums[i] - nums[0]));
            } else {
                maxDiff = Math.max(maxDiff,Math.abs(nums[i] - nums[i+1]));
            }
        }
        System.out.println(maxDiff);
    }
}
