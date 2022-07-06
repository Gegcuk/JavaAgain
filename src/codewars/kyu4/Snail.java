package codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) {
         snail(new int[][]{{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}});
    }

    public static int[] snail(int[][] array) {

        int startRow = 0, endRow = array.length, startCol = 0, endCol = array[0].length;
        while (startRow <= array.length/2){
            goRight(startCol, endCol, startRow, array);
            startRow++;
            goDown(startRow, endRow, endCol, array);
            endCol--;
            goLeft(endCol, startCol, endRow, array);
            endRow--;
            goUp(endRow, startRow, startCol, array);
            startCol++;
        }
        int[] res = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            res[i] = resultList.get(i);
            System.out.println(res[i]);
        }
        resultList.clear();
        return res;
    }

    public static void goRight(int startCol, int finishCol, int row, int[][] array){
        for(int i = startCol; i < finishCol; i++){
            resultList.add(array[row][i]);
        }
    }

    public static void goDown(int startRow, int endRow, int col, int[][] array){
        for(int i = startRow; i < endRow; i++){
            resultList.add(array[i][col-1]);
        }
    }

    public static void goLeft(int startCol, int finishCol, int row, int[][] array){
        for(int i = startCol-1; i >= finishCol; i--){
            resultList.add(array[row-1][i]);
        }
    }

    public static void goUp(int startRow, int endRow, int col, int[][] array){
        for(int i = startRow-1; i >= endRow; i--){
            resultList.add(array[i][col]);
        }
    }

}
