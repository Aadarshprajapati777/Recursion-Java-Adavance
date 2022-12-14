import java.sql.Array;

// check if an array is sorted or not(strictly increasing)

public class Recursion21 {

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        int inx = 0;
        isSorted(num, inx);
    }

    public static boolean isSorted(int num[], int inx) {
        if (inx == num.length - 1) {
            return true;
        }
        if (num[inx] < num[inx + 1]) {

            return isSorted(num, inx + 1);
        }

        else {
            return false;
        }

    }

}
