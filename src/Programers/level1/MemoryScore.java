package Programers.level1;


import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MemoryScore {

    public static void main(String args[]) {
        String[] names = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        int[] answers = new int[photo.length];

        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i=0; i<names.length; i++) {
            scoreMap.put(names[i], yearning[i]);
        }

        for (int i=0; i< photo.length; i++) {
            for (int j=0; j < photo[i].length; j++) {
                if (scoreMap.get(photo[i][j]) != null) {
                    answers[i] += scoreMap.get(photo[i][j]);
                }
            }
        }
        for (int answer : answers) {
            System.out.println("answer = " + answer);
        }

    }
}
