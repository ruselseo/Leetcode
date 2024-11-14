package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.                [12, 3, 1, 2, -6, 5, -8, 6]
        List<Integer[]> res = new ArrayList<>();
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < sortedArray.length - 1; i++) {
            targetSum -= sortedArray[i];
            int r = sortedArray.length - 1;
            int l = i + 1;
            while (l < r) {
                if (sortedArray[l] + sortedArray[r] == targetSum) {
                    res.add(new Integer[]{sortedArray[i], sortedArray[l], sortedArray[r]});
                    l++;
                    r--;
                } else if (sortedArray[l] + sortedArray[r] < targetSum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
