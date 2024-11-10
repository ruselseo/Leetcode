package main.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Deque<Integer> res = new ArrayDeque<>(results);
        Map<String, Integer> teamsMap = competitions.stream().flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toMap(i->i, k-> 0));

        Map<String, String> mathes = competitions.stream()
                .collect(Collectors.toMap(ArrayList::getFirst, ArrayList::getLast));

        mathes.forEach((k, v) -> {
            if(res.pollFirst() == 1){
                teamsMap.replace(k, teamsMap.get(k)+1);
            } else {teamsMap.replace(v, teamsMap.get(v)+1);}
        });

        Optional<Integer> max = teamsMap.values().stream().max(Comparator.naturalOrder());

        return teamsMap
                .entrySet()
                .stream()
                .filter(entry -> max.get().equals(entry.getValue()))
                .map(Map.Entry::getKey).toList().getFirst();
    }
}
