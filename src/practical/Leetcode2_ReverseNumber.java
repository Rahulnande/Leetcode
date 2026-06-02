package practical;

class Solutions {

    public int reverse(int n) {

        int rev = 0;

        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return rev;
    }
}

public class Leetcode2_ReverseNumber {

    public static void main(String[] args) {

        Solutions s = new Solutions();

        int result = s.reverse(-143);

        System.out.println(result);
    }
}