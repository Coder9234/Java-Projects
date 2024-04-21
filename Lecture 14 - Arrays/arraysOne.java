import java.util.*;

public class arraysOne{
//     public static void update(int marks[], int nonChangable){
//         nonChangable = 10;
//         for (int i = 0; i < marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }

    // // Linear search 
    // public static int linearSearch(int numbers[], int key){
    //     for (int i = 0; i < numbers.length; i++){
    //         if (numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Finding the largest number
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for (int i = 0; i < numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if (smallest > numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("Smallest value is: " + smallest);
    //     return largest;
    // }

    // Binary Search
    // public static int binarySearch(int numbers[], int key){
    //     int start = 0, end = numbers.length - 1;
    //     while (start <= end){
    //         int mid = (start + end) / 2;
    //         // comparisons
    //         if (numbers[mid] == key){
    //             return mid;
    //         }
    //         if(numbers[mid] < key){
    //             start = mid + 1;
    //             return mid;
    //         }
    //         if (numbers[mid] > key){
    //             end = mid - 1;
    //             return mid;            
    //         }
    //     }
    //     return -1;
    // }

    // public static void reverse(int numbers[]){
    //     int first = 0, last = numbers.length - 1;
    //     while (first < last){
    //         // swap
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }

    // Pairs in an Array
    // public static void pairs(int numbers[]){
    //     int total = 0;
    //     for (int i = 0; i < numbers.length; i++){
    //         int current = numbers[i];
    //         for (int j = i + 1; j < numbers.length; j++){
    //             System.out.print(" (" + current + "," + numbers[j] + ") ");
    //             total++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs: " + total);
    // }

    // Print subarrays
    public static void subarrays(int numbers[]){
        int count = 0;
        int total = 0; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                if (min > sum){
                    min = sum;
                }
                if (max < sum){
                    max = sum;
                }
                count++;
                total+= sum;
                System.out.println();
            } 
            System.out.println();  
        }
        System.out.println("Total pairs are: " + count);
        System.out.println("The sum of subarrays is: " + total);
        System.out.println("The max sum is: " + max);
        System.out.println("The min sum is: " + min);
    }

    // Max Subarray Sum
    // public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < numbers.length; i++){
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++){
    //             int end = j;
    //             currSum = 0;
    //             for (int k = start; k <= end; k++){
    //                 // subarray sum
    //                 currSum += numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }   
    //     }
    //     System.out.println("Max sum is: " + maxSum);
    // }
      
    public static void main(String args[]){
        // Input Output in arrays
        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Physics: " + marks[0]);
        // System.out.println("Chemistry: " + marks[1]);
        // System.out.println("Maths: " + marks[2]);
        // //  Update
        // marks[2] = 100;
        // System.out.println("Maths: " + marks[2]);
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println(percentage);
        // System.out.println("Length of an array: " + marks.length);

        // Arrays as function arguments 
        // int marks[] = {97, 98, 99};
        // int nonChangable = 5;
        // update(marks, nonChangable);
        // System.out.println(nonChangable);
        // // print our marks
        // for (int i = 0; i < marks.length; i++){
        //     System.out.println(marks[i] + " ");
        // }
        // System.out.println();

        // Linear search
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 20;
        // int index = linearSearch(numbers, key);
        // if (index == -1){
        //     System.out.println("Key not found!!");
        // }
        // else {
        //     System.out.println("Key is at index " + index);
        // }

        // Largest number
        // int numbers[] = {1, 2, 6, 3, 5};
        // System.out.println("Largest value is: " + getLargest(numbers));

    // Binary Search
    // int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    // int key = 25;
    // System.out.println("Index: " + binarySearch(numbers, key));

        // reverse
        // int numbers[] = {2, 4, 6, 8, 10};
        // reverse(numbers);
        // for (int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i] + " ");
        // }  

        // Pairs in Array
        // int numbers[] = {2, 4, 6, 8, 10};
        // pairs(numbers);
        
        // Print Subarrays
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);

        // Max-subarray sum
        // int numbers[] = {1, -2, 6, -1, 3};
        // maxSubarraySum(numbers);
    }
}
