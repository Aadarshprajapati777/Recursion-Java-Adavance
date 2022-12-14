// print x^n(static height = logn)
public class Recursion5 {
    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcpower(x, n / 2) * calcpower(x, n / 2);
        }
        // n is odd
        else {
            return calcpower(x, n / 2) * calcpower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int ans = calcpower(2, 5);
        System.out.println(ans);

    }

}
