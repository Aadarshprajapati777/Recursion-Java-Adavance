public class Recursion9 {
    public static void main(String[] args) {
        int num[] = { 12345 };

        System.out.println(checkSort(num, 0));
    }

    public static boolean checkSort(int num[], int inx) {
        if (inx == num.length - 1) {
            return true;

        }

        if (num[inx] < num[inx + 1]) {
            return checkSort(num, inx + 1);
        } else {
            return false;
        }

    }
}