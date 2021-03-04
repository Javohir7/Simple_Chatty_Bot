import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ans = true;
        Vector<Integer> v = new Vector<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            v.add(n);
        }
        if (v.size() <= 2) System.out.println("true");
        else {
            int g = 2;
            for (int i = 1; i < v.size(); i++) {
                if (v.get(i) > v.get(i - 1)) {
                    g = 1;
                    break;
                } else if (v.get(i) < v.get(i - 1)) {
                    g = -1;
                    break;
                }
            }
            if (g == 1) {
                for (int i = 1; i < v.size(); i++) {
                    if (v.get(i) < v.get(i - 1)) {
                        ans = false;
                        break;
                    }
                }
            } else {
                for (int i = 1; i < v.size(); i++) {
                    if (v.get(i) > v.get(i - 1)) {
                        ans = false;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}