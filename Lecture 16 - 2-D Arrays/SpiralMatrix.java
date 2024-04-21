public class SpiralMatrix {

    public static void PrintSpiral(int matrix[][]){
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix.length - 1;
        while (startRow <= endRow && startColumn <= endColumn){
            // top
            for (int j = startColumn; j <= endColumn; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endColumn] + " ");
            }
            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow; i--){
                if (startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }
            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        PrintSpiral(matrix);
    }
}
