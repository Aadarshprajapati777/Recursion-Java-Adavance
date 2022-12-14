// print the fibonacci sequence till nth term

public class Recursion16 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printfibo(0, 1, 2);
    }

    public static void printfibo(int a, int b, int i) {
        if (i == 7) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfibo(b, c, i + 1);

    }
}
