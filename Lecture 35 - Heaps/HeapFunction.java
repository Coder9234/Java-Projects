import java.util.*;

public class HeapFunction {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int parent = (x - 1) / 2;
            while (arr.get(x) < arr.get(parent)){ // O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){ // O(log n)
            int mini = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < arr.size() && arr.get(mini) > arr.get(left)){
                mini = left;
            }
            if (right < arr.size() && arr.get(mini) > arr.get(right)){
                mini = right;
            }
            if (mini != i){
                // swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(mini));
                arr.set(mini, temp);
                heapify(mini);
            }
        }

        public int remove(){
            int data = arr.get(0);
            // step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 = delete last
            arr.remove(arr.size() - 1); 

            // heapify
            heapify(0);
            return 0;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
   }
    public static void main(String args[]){ // Heap Sort
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
