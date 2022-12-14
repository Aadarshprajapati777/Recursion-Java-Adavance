// print the sum of n natural numbers
public class Recursion14 {
    public static void main(String[] args) {
        printSum(1, 500, 0);
    }

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);

    }
}