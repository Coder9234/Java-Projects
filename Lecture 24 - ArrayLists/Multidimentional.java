import java.util.ArrayList;
public class Multidimentional {
    public static void main(String args[]){
        // Multidimentional ArrayList
        // ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        // ArrayList<Integer>list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list);

        // ArrayList<Integer>list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++){
        //     ArrayList<Integer>currlist = mainList.get(i);
        //     for (int j = 0; j < currlist.size(); j++){
        //         System.out.print(currlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);
        

        // Creating table using Multidimentional ArrayList
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

        // Nested Loops
        for(int i = 0; i < mainlist.size(); i++){
            ArrayList<Integer> currList = mainlist.get(i);
            for (int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
