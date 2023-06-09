package Programers.level1;

import java.util.Arrays;

public class Window {

    public static void main(String args[]) {

        String[] wallpaper = {"...#.", "....#.", ".##..."};

        int minRow = Integer.MIN_VALUE;
        int minCol = Integer.MIN_VALUE;
        int maxRow = Integer.MAX_VALUE;
        int maxCol = Integer.MAX_VALUE;

        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    minRow = Math.min(minRow, r);
                    minCol = Math.min(minCol, c);
                    maxRow = Math.max(maxRow, r);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }


    }
}
