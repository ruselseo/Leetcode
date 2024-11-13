package main.java;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
        Map<Integer, Boolean> treeMap = new HashMap<Integer, Boolean>();
        int max =0;
        int start = 0;
        int end;

        for (end = 0; end < fruits.length; end++) {
            if (treeMap.size() < 2 && !treeMap.containsKey(fruits[end])) {
                treeMap.put(fruits[end], true);
                max = Math.max(max, end - start + 1);
            } else if (treeMap.containsKey(fruits[end])) {
                max = Math.max(max, end - start + 1);
            } else {
                treeMap = new HashMap<Integer, Boolean>();
                treeMap.put(fruits[end], true);
                treeMap.put(fruits[end - 1], true);
                start = end - 1;

                if (start > 0) {
                    while (fruits[start] == fruits[start - 1]) {
                        start--;
                    }
                }
                max = Math.max(max, end - start + 1);
            }
        }


    return max;
    }

}
