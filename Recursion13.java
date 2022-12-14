//remove the repeated alphabets
public class Recursion13 {
    public static void main(String[] args) {
        String str = "abbccda";

        removeAlpha(str, 0, "");
    }

    public static boolean[] map = new boolean[26];

    public static void removeAlpha(String str, int inx, String newString) {
        char currchar = str.charAt(inx);
        if (map[currchar - 'a']) {
            removeAlpha(str, inx + 1, newString);
        } else {
            newString += currchar;
            map[currchar - 'a'] = true;
            removeAlpha(str, inx + 1, newString);
        }

    }

}
