public class PalindromeNum{
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));  // true
    }
}

