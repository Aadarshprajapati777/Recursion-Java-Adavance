// print x^n (stack height =n)
public class Recursion4 {
    public static void main(String[] args) {
        int ans = calcPower(2, 5);
        System.out.println(ans);
    }

    public static int calcPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpwnm1 = calcPower(x, n - 1);
        int xpn = x * xpwnm1;

        return xpn;

    }
}
