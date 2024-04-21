public class questions {
    public static int count(int array[][]){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static int sum(int nums[][]){
        int sum = 0;
            for (int j = 0; j < nums[0].length; j++){
                sum += nums[1][j];
            }
            return sum;
        }

    public static void PrintMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String args[]){
    // Q1.
    //     int array[][] = {{4, 7, 8}, {8, 8, 7}};
    //     System.out.println(count(array));

    // Q2.
    // int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
    // System.out.println(sum(nums));

    // Q3.
        int row = 2, col = 3; 
        int matrix[][] = {{2, 3, 7}, {5, 6, 7}};
        System.out.println("The original matrix is: ");
        PrintMatrix(matrix);

        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose matrix is: ");
        PrintMatrix(transpose);
    }
}
