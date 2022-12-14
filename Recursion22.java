// move all X to the end of the string
public class Recursion22 {
    public static void main(String[] args) {
        movex("axbcxxd", 0, " ", 0);
        int count = 0;

    }

    public static void movex(String str, int inx, String newstr, int count) {
        if (inx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';

            }
            System.out.println(newstr);
            return;
        }

        if (str.charAt(inx) == 'x') {
            count++;
            movex(str, inx + 1, newstr, count);
        } else {
            newstr += str.charAt(inx);
        }
        movex(str, inx + 1, newstr, count);
    }
}
