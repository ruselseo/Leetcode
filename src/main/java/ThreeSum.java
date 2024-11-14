package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> res = new ArrayList<>();
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < sortedArray.length - 2; i++) {
            int l = i + 1;
            int r = sortedArray.length - 1;
            while (l < r) {
                int currentSum = sortedArray[i] + sortedArray[l] + sortedArray[r];
                if (currentSum == targetSum) {
                    res.add(new Integer[]{sortedArray[i], sortedArray[l], sortedArray[r]});
                    l++;
                    r--;
                } else if (currentSum < targetSum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}