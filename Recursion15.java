// print the factoral of number n

public class Recursion15 {
    public static void main(String[] args) {
        int ans = printFactorial(5);
        System.out.println(ans);
    }

    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int nm1 = printFactorial(n - 1);
        int fact = nm1 * n;
        return fact;
    }
}
