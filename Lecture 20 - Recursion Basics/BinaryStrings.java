public class BinaryStrings {
    public static void strings(int n, int lastPlace, String str){
        if (n == 0){
            System.out.println(str);
            return;
        }
        strings(n - 1, 0, str + "0");
        if (lastPlace == 0){
            strings(n - 1, 1, str + "1");
        }
    }
    public static void main(String args[]){
        strings(3, 0, "");
    }
}
  