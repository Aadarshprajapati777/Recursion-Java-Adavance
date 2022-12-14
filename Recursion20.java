// printing a string in reverse
public class Recursion20 {
    public static void main(String[] args) {
        String string = "abcdefghij";
        int index = string.length() - 1;
        printrev(string, index);
    }

    public static void printrev(String string, int index) {
        if (index == 0) {
            System.out.println(string.charAt(index));
            return;
        }
        System.out.println(string.charAt(index));
        printrev(string, index - 1);
    }
}