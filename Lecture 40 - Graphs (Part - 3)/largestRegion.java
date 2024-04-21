import java.util.*;

public class largestRegion {
    public class Pair{
        int row;
        int col;

        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public static int countReg(int grid[][], int i, int j, int count){
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        if (countReg(grid, i - 1, j, count) == 1){ // up row
            count++;
        }
        if (countReg(grid, i + 1, j, count) == 1){ // down row
            count++;
        }
        if (countReg(grid, i, j - 1, count) == 1){ // left row
            count++;
        }
        if (countReg(grid, i, j + 1, count) == 1){ // right row
            count++;
        }
        return 1;
    }
    
    public static int largest(int grid[][]){
        int max = 0;
        int n = grid.length; 
        int m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int count = 1;
                if (grid[i][j] == 1){
                    countReg(grid, i, j, count);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}
