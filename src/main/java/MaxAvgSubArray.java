package main.java;

public class MaxAvgSubArray {
        public double findMaxAverage(int[] nums, int k) {
            int windowSum = 0;
            int start = 0;
            int end = 0;
            double max = Double.NEGATIVE_INFINITY;
            for(end = 0; end < nums.length; end++){
                windowSum += nums[end];

                if(end - start+1 == k){
                    if(max < (double)windowSum/k) max = (double)windowSum/k;
                    windowSum -= nums[start];
                    start++;
                }

            }
            return max;
        }
}
