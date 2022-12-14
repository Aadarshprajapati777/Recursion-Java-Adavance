// print x^n (stack height=n)

public class REcursion17 {
    public static void main(String[] args) {

        System.out.println(calcpower(2, 5));

    }

    public static int calcpower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpownm1 = calcpower(x, n - 1);
        int xpown = x * xpownm1;

        return xpown;
    }
}
