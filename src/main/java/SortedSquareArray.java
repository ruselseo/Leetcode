package main.java;

import java.util.Arrays;

public class SortedSquareArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(i->i*i).sorted().toArray();
    }
    public int[] sortedSquares2(int[] nums) {
        int[] res = new int[nums.length];
        int max = nums.length-1;
        int min = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if(Math.abs(nums[max])>Math.abs(nums[min])){
                res[i] = nums[max]*nums[max];
                max--;
            }else {
                res[i] = nums[min]*nums[min];
                min++;
                }
        } return res;
    }
}
