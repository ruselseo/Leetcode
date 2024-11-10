package main.java;

import java.util.Arrays;

public class SortedSquareArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(i->i*i).sorted().toArray();
    }
}
