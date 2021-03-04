import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int n = sc.nextInt();
        v.add(n);
        if (n != 1) {
            while (n != 1) {
                int num = n;
                n = num % 2 == 0 ? n / 2 : (n * 3 + 1);
                v.add(n);
            }
        }
        for (Integer i : v) {
            System.out.print(i + " ");
        }
    }
}