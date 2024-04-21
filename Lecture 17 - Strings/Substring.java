public class Substring{
    public static String substring(String str, int si, int ei){
        String substr = "";
        for (int i = 0; i < str.length() - 1; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println(substring(str, 0, 5));
    }
}