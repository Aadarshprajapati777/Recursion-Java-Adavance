public class Recursion12 {
    public static void main(String[] args) {
        printNum(1);

    }

    static String str = "1";

    public static String printNum(int num) {
        if (num == 7) {
            return "";
        }
        System.out.print(str);
        System.out.println();

        str = str + (num + 1);
        printNum(num + 1);
        return "";
    }
}