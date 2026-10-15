class Solution {
    public int reverse(int n) {

        boolean isNegative = n < 0;

        if (n < 0) {
            n = Math.abs(n);
        }

        int rev = 0;

        while (n > 0) {

            int rem = n % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            rev = (rev * 10) + rem;

            n /= 10;
        }

        if (isNegative) {
            rev = rev * -1;
        }

        return rev;
    }
}