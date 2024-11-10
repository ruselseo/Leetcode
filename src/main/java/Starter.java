package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions =
                new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 =
                new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 =
                new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 =
                new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        System.out.println(TournamentWinner.tournamentWinner(competitions, results));
    }
}
