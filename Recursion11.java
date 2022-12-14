public class Recursion11 {
    public static void main(String[] args) {
        pattern("*", 0);
    }

    public static void pattern(String element, int n) {
        if (n == 5) {
            return;
        }
        pattern(element + "*", n + 1);
        System.out.println(element);

    }
}
