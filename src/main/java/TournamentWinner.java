package main.java;
import java.util.*;
import java.util.stream.Collectors;

public class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Deque<Integer> res = new ArrayDeque<>(results);
        Map<String, Integer> teamsMap = competitions.stream().flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toMap(i->i, k-> 0));

//        LinkedHashMap<String, String> mathes = competitions.stream()
//                .collect(Collectors.toMap(ArrayList::getFirst, ArrayList::getLast, (x, y) -> x+"1", LinkedHashMap::new));

            for (int i = 0; i < competitions.size(); i++) {
                if(res.pollFirst() == 1){
                    teamsMap.replace(String.valueOf(competitions.get(i).getFirst()), teamsMap.get(competitions.get(i).getFirst())+1);
                } else {teamsMap.replace(String.valueOf(competitions.get(i).getLast()), teamsMap.get(String.valueOf(competitions.get(i).getLast()))+1);}
                }

        Optional<Integer> max = teamsMap.values().stream().max(Comparator.naturalOrder());

        return teamsMap
                .entrySet()
                .stream()
                .filter(entry -> max.get().equals(entry.getValue()))
                .map(Map.Entry::getKey).toList().getFirst();
    }
}
