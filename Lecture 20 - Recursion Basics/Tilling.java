public class Tilling {
    public static int arrangeTile(int n){
        if (n == 0 || n == 1){
            return 1; 
        }
        return arrangeTile(n - 1) + arrangeTile(n - 2);
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(arrangeTile(n));
    }
}
