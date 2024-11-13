package main.java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> competitions =
//                new ArrayList<ArrayList<String>>();
//        ArrayList<String> competition1 =
//                new ArrayList<String>(Arrays.asList("HTML", "C#"));
//        ArrayList<String> competition2 =
//                new ArrayList<String>(Arrays.asList("C#", "Python"));
//        ArrayList<String> competition3 =
//                new ArrayList<String>(Arrays.asList("Python", "HTML"));
//        competitions.add(competition1);
//        competitions.add(competition2);
//        competitions.add(competition3);
//        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
//        ArrayList<ArrayList<String>> competitions3 = new ArrayList<>(List.of(
//                new ArrayList<>(List.of("HTML", "Java")),
//                new ArrayList<>(List.of("Java", "Python")),
//                new ArrayList<>(List.of("Python", "HTML")),
//                new ArrayList<>(List.of("C#", "Python")),
//                new ArrayList<>(List.of("Java", "C#")),
//                new ArrayList<>(List.of("C#", "HTML"))
//        ));
//        ArrayList<Integer> results3 = new ArrayList<>(List.of(0, 1, 1, 1, 0, 1));
//
//        System.out.println(TournamentWinner.tournamentWinner(competitions3, results3));

//        int k = 4;
        int[] nums = {1,0,3,4,3};
//        var maxAvg = new MaxAvgSubArray();
//
//        System.out.println(maxAvg.findMaxAverage(nums, k));

//        int[][] array = new int[][]{{1,2,3},{4,5,6}};
//        System.out.println(array[0].length);
//
//        TransposeMatrix transposeMatrix = new TransposeMatrix();
//        System.out.println(Arrays.deepToString(transposeMatrix.transpose(array)));

        FruitIntoBasket fruitIntoBasket = new FruitIntoBasket();
        System.out.println(fruitIntoBasket.totalFruit(nums));
    }
}
