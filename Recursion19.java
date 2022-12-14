import javax.xml.transform.Source;

// tower of hanoi

public class Recursion19 {
    public static void main(String[] args) {
        towerofhanoi(6, "S", "H", "D");
    }

    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Disk " + n + " transfferd from  " + src + " to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, helper);
        System.out.println("Disk " + n + " transfferd from  " + src + " to " + dest);
        towerofhanoi(n - 1, helper, src, dest);
    }
}
