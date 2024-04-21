import java.util.*;

public class Strings{
    public static void PrintLetters(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // Input/ Ouput
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String Length
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // Concatenation
        // String firstName= "Nandini";
        // String lastName = "Vishwanath";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // charAt() Method
        // String firstName= "Nandini";
        // String lastName = "Vishwanath";
        // String fullName = firstName + " " + lastName;
        // PrintLetters(fullName);
    }
}