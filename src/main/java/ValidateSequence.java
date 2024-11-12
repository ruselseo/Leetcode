package main.java;

import java.util.List;

/**
 *
 */

public class ValidateSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            if (sequenceIndex == sequence.size()) return true;
        }
        return false;
    }

    public static boolean isSubsequence(String s, String t) {

        char[] first  = s.toCharArray();
        char[] second = t.toCharArray();
        int secondIndex = 0;
        if (s.equals(t)) return true;
        for (int i = 0; i < first.length; i++) {
            if (second.length!=0 && first[i] == second[secondIndex]) {
                secondIndex++;
            }
            if (secondIndex == second.length) return true;
        }
        return false;
    }
}
