public class OddEven {
    public static void odd_even(int n){
        int bitMask = 1;
        // even number
        if ((n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    
    // get ith bit
    public static int get_ith_bit(int n, int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }

    // set the ith bit
    public static int set_ith_bit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear ith bit
    public static int clear_ith_bit(int n, int i){
        int bitMask = ~(1 << i);
            return n & bitMask;
    }

    // update ith bit
    public static int update_ith_bit(int n, int i, int newBit){
        // 1st approach
        if (newBit == 0){
            return clear_ith_bit(n, i);
        }
        else{
            return set_ith_bit(n, i);
        }

        // 2nd Approach
        // n = clear_ith_bit(n, i);
        // int BitMask = newBit << i;
        // return n | BitMask;
    }

    // clear last ith bits
    public static int clear_last_ith_bits(int n, int i){
        int BitMask = (-1) << i;
        return n & BitMask;
    }

    // Clear range of bits
    public static int clear_range_of_bits(int n, int i, int j){
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // power of 2
    public static boolean isPowerOfTwo(int n){
        if ((n & (n - 1)) == 0){
            return true;
        }
        return false;
    }

    // count set bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // fast exponentiation
    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while (n > 0){
            if ((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]){
        // Chcek if the numbr is even or odd
        // odd_even(3);
        // odd_even(11);
        // odd_even(14);

        // get the ith bit
        // System.out.println(get_ith_bit(10, 3));

        // set ith bit
        // System.out.println(set_ith_bit(10, 2));

        // clear ith bit 
        // System.out.println(clear_ith_bit(10, 1));

        // update ith bit
        System.out.println(update_ith_bit(12, 1, 1));

        // clear last ith bits
        // System.out.println(clear_last_ith_bits(15, 2));

        //clear range of bits
        // System.out.println(clear_range_of_bits(10, 2, 4)); 

        // check if a number is a power of 2 or not
        // System.out.println(isPowerOfTwo(7));

        // count set bits in a number
        // System.out.println(countSetBits(15));

        // // fast Exponentiation
        // System.out.println(fastExponentiation(5, 3));
    }
}
