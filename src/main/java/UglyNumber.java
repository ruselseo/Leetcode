
public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] p = {2, 3, 5};
        for (int j : p) {
            while (n % j == 0) {
                n = n / j;
            }
            if (n == 1) return true;
        }
    return false;
    }
}
