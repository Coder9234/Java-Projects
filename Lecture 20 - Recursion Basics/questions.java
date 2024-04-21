public class questions {
    public static void occurence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if (arr[i] == key){
            System.out.println(i + " ");
        }
        occurence(arr, key, i + 1);
    }

    public static void StringToNumber(int n){
        String digits[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (n == 0){
            return;
        }
        int lastDigit = (n - 1) % 10;
        StringToNumber((n - 1) / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static int StringLength(String str){
        if(str.length() == 0){
            return 0;
        }
        return 1 + StringLength(str.substring(1));
    }

    // public static int contiguous(String str, int n){
    //     if (n == 0){
    //         return 0;
    //     }
    //     if (n == 1){
    //         return 1;
    //     }

    // }

    public static void TowerofHanoi(int n, String src, String helper, String destination){
        if (n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }
        TowerofHanoi(n - 1, src, destination, helper);
        System.out.println("Transfer disk " + n  + " from " + src + " to " + helper);
        TowerofHanoi(n - 1, src, helper, destination);
    }
    public static void main(String args[]){
        // Q1.
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // occurence(arr, key, 1);

        // Q2.
        // StringToNumber(123);

        // Q3.
        // String str = "nandini";
        // System.out.println(StringLength(str));

        // Q4.
        int n = 4;
        TowerofHanoi(n, "A", "B", "C");
    }
}
