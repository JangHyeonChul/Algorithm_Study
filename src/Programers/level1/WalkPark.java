package Programers.level1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WalkPark {

    public static void main(String args[]) {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};

        char[][] parkload = new char[park.length][park[0].length()];

        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            parkload[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                y = i;
                x = park[i].indexOf("S");
            }
        }


        for (int i=0; i< park.length; i++) {
            for (int j=0; j < parkload[i].length; j++) {
                parkload[i][j] = park[i].charAt(j);
            }
        }


        for (String route : routes) {
            String[] splitRoute = route.split(" ");
            String direction = splitRoute[0];
            int count = Integer.parseInt(splitRoute[1]);

            int dx = x;
            int dy = y;

            System.out.println("dy = " + dy);
            System.out.println("dx = " + dx);

            // O O S
            // O X X
            // O O O

            for (int i=0; i<count; i++) {

                switch (direction) {
                    case "E":
                        dx++;
                        break;
                    case "S":
                        dy++;
                        break;
                    case "N":
                        dy--;
                        break;
                    case "W":
                        dx--;
                        break;
                }

                if (dx >= 0 && dx < parkload[0].length && dy >= 0 && dy < park.length) {
                    if (parkload[dy][dx] == 'X') {
                        break;
                    }

                    if (i == (count-1)) {
                        x = dx;
                        y = dy;
                    }
                }

            }

        }
        int[] answer = new int[2];
        answer[0] = y;
        answer[1] = x;


    }

}
