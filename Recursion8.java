// printing a string in reverse
public class Recursion8 {
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length() - 1);

    }

    public static void printRev(String str, int inx) {
        if (inx == 0) {
            System.out.println(str.charAt(inx));
            return;
        }
        System.out.println(str.charAt(inx));
        printRev(str, inx - 1);

    }
}