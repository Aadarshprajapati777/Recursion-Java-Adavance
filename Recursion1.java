// print sum of n natural numbers 
public class Recursion1 {
    public static void printSum(int n, int i, int sum) {
        if (i == n) {
            sum += n;
            System.out.println("sum is: " + sum);
            return;
        }

        sum += i;
        printSum(n, i + 1, sum);

    }

    public static void main(String[] args) {
        int n = 5;
        printSum(5, 1, 0);
    }

}
