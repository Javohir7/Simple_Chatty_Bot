import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        Vector<Integer> v = new Vector<>();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                v.add(i);
            }
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}