import java.util.*;

public class Matrices{
    public static boolean Search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println("Fount at cell (" + i + "," + j + ")");
                    return true;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element is: " + largest);
        System.out.println("The smallest elemnt is: " + smallest);
        //  Output
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);
    }
}