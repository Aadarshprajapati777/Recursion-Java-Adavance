// print  the subsequences of the string
public class Recursion24 {
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");

    }

    public static void subsequences(String str, int inx, String newstr) {
        if (inx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(inx);
        // if currchar comes
        subsequences(str, inx + 1, newstr + currchar);

        // if currchar doesnt come
        subsequences(str, inx + 1, newstr);
    }
}