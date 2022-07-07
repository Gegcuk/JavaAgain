package codewars.kyu4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SudokuValidator {
    private static final int SUM = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) * 9;
    private static final int[] base_arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(checkSum(sudoku));
        System.out.println(checkRows(sudoku));
        System.out.println(checkCols(sudoku));
        System.out.println(checkSquares(sudoku));

    }

    public static boolean check(int[][] sudoku) {

        return checkSum(sudoku) && checkRows(sudoku) && checkCols(sudoku) && checkSquares(sudoku);
    }

    private static boolean checkSquares(int[][] sudoku) {
        int res[] = new int[sudoku.length];
        boolean flag = true;
        for(int i = 0; i < sudoku.length; i+=3){
            for (int j = 0; j < sudoku.length; j+=3){
                for(int u = 0, counter = 0; u < 3; u++){
                    for(int v = 0; v < 3; v++, counter++){
                        res[counter] = sudoku[i+u][j+v];
                    }
                }
                Arrays.sort(res);
                if (!Arrays.equals(res, base_arr)){
                    System.out.println(!Arrays.equals(res, base_arr));
                    flag = false;
                };
            }
        }
        return flag;
    }

    private static boolean checkCols(int[][] sudoku) {
        boolean flag = true;
        int res[] = new int[sudoku.length];
        for(int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku.length; j++){
                res[j] = sudoku[j][i];
            }
            Arrays.sort(res);
            if (!Arrays.equals(res, base_arr)){
                System.out.println(!Arrays.equals(res, base_arr));
                flag = false;
            }
        }
        return flag;
    }

    private static boolean checkRows(int[][] sudoku) {
        boolean flag = true;
        int[] arrayForComp = new int[sudoku.length];
        for(int i = 0; i < sudoku.length; i++){
            arrayForComp = Arrays.copyOf(sudoku[i], sudoku.length);
            Arrays.sort(arrayForComp);
            if (!Arrays.equals(arrayForComp, base_arr))
                flag = false;
            }
        return flag;
    }

    private static boolean checkSum(int[][] sudoku) {
        int result = 0;
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku[0].length; j++){
                result += sudoku[i][j];
            }
        }
        return result == SUM;
    }
}
