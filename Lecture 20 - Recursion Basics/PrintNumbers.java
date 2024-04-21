public class PrintNumbers{
    public static void PrintDec(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void printInc(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        int n = 10;

        // print the numbers from 1 to n in decreasing order
        // PrintDec(n);

        // Printing the number from 1 to n in increasong order
        printInc(n);
    }
}