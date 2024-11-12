package main.java;

import java.util.Arrays;

/**
 * Given an array of positive integers representing the values of coins in your possession, write a function that
 * returns the minimum amount of change (the minimum sum of money) that you cannot create. The
 * given coins can have any positive integer value and aren't necessarily unique (i.e., you can have multiple coins of the same value).
 * For example, if you're given coins = [1, 2, 5], the minimum amount of change that you can't create is 4. If you're given no coins,
 * the minimum amount of change that you can't create is 1

 * Sample Input
 * coins = [5, 7, 1, 1, 2, 3, 22]
 * Sample Output
 * 20
 */

public class NonConstructibleChange {
    class Solution {
        public int nonConstructibleChange(int[] coins) {
            // Write your code here.
//            int coinsSum = Arrays.stream(coins).sum();
//            if (coinsSum == 0) return 1;
//            int l = 0;
//            int current = 0;
//            int number = 0;
//            while(number < coinsSum) {
//                if (coins[l] - number == 0) number++;
//                else if (coins[l] - number > 0) l++;
//                else if (coins[l] - number < 0) l++;
//                else {}
//            }
//            return number;

            Arrays.sort(coins);
            int ncChange = 0;
            for (int coin : coins) {
                if (coin > ncChange+1) return ncChange+1;

                ncChange += coin;

            } return ncChange+1;
        }
    }
}
