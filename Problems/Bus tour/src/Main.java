import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, n, k = 1, index = -1;
        height = sc.nextInt();
        n = sc.nextInt();
        while (n > 0) {
            int h = sc.nextInt();
            if (h <= height) {
                index = k;
                break;
            }
            k++;
            n--;
        }
        if (index == -1) System.out.println("Will not crash");
        else System.out.println("Will crash on bridge " + index);
    }
}