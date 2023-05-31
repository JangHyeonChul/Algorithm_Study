package Programers.level1;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {

    public static void main(String args[]) {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] calling = {"kai", "kai", "mine", "mine"};

    Map<String, Integer> rankMap = new HashMap<>();
    int rank = 0;

        for (String player : players) {
        rankMap.put(player, rank);
        rank++;
    }


        for (String call : calling) {
        int playerRank = rankMap.get(call); // playerRank = 4
        String temp = players[playerRank];
        String currentPlayer = players[playerRank - 1];

        players[playerRank - 1] = temp;
        players[playerRank] = currentPlayer;

        rankMap.put(call, playerRank - 1);
        rankMap.put(currentPlayer, playerRank);
    }

        for (String player : players) {
        System.out.println("player = " + player);
    }
    }
}
