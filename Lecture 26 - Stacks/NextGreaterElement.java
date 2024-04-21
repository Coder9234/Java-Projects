import java.util.*;
public class NextGreaterElement {

    public static void main(String args[]){ // O(n)
        int arr[] = {6, 8, 0, 1, 3}; 
        Stack<Integer>s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            // Step 1: while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //Step 2:  if - else
            if (s.isEmpty()){
                nextGreater[i] = -1;
            }
            else
            {
                nextGreater[i] = arr[s.peek()];
            }              
            // Step 3: push in s
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
        // next Greater Right
        // next Greater Left(reverse the for loop)
        // next Smaller Right(reverse the while condition)
        // next Smaller Left(reverse the for loop and reverse the while loop)
    }
}
