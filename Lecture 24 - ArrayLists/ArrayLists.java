import java.util.ArrayList;

public class ArrayLists{
    public static void main(String args[]){
        // Java Collection Framework
        ArrayList<Integer>list = new ArrayList<>();
        // ArrayList<String>list2 = new ArrayList<>();
        // ArrayList<Boolean>list3 = new ArrayList<>();

        // add element in ArrayList
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9);
        System.out.println(list.size());

        // print the arrayList
        // reversing the elements
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // get element
        int element = list.get(2);
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);

        // set element at a particular index
        list.set(2, 10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}