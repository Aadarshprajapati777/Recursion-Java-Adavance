public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (j - 1); j--) {
                System.out.println(" ");
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}
