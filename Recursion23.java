//  remove all duplicates in the string
public class Recursion23 {
    public static void main(String[] args) {
        removedup("aabbccddee", 0, "");
    }

    public static boolean map[] = new boolean[26];

    public static void removedup(String str, int inx, String newwstr) {
        if (inx == str.length()) {
            System.out.println(newwstr);
            return;
        }
        char currchar = str.charAt(inx);
        if (map[currchar - 'a']) {
            removedup(str, inx + 1, newwstr);
        } else {
            newwstr += currchar;
            map[currchar - 'a'] = true;
            removedup(str, inx + 1, newwstr);
        }
    }
}