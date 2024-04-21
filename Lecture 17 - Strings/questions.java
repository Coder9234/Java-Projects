
import java.util.*;

public class questions {
    public static String anagrams(String str1, String str2, char arr1[], char arr2[]){
        int j = 0;
        for (int i = 0; i < str1.length(); i++){
            char ch1 = str1.charAt(i);
            j += str1.charAt(i);
            j++;
        }
        for (int i = 0; i < str2.length(); i++){
            char ch2 = str2.charAt(i);
            j += str2.charAt(i);
            j++;
        }
        if (str1.length() == str2.length()){
            Arrays.sort(str1);

        }
    }
    public static void main(String args[]){
        // String str = new Scanner(System.in).next();
        // Q1.
        // int count = 0;
        // for (int i = 0; i < str.length(); i++){
        //     char ch = str.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         count++;
        //     }
        // }
        // System.out.println("The no of vowels are: " + count);

        // Q2.
        // String str = "ShraddhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShraddhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // Q3.
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        // Q4.
        
    }
}
