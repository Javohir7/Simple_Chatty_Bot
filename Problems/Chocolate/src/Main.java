import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        boolean f = false;
        for (int j = 1; j <= k; j++) {
            if (k % j == 0) {
                int a = j, b = (k) / j;
                if (a == n && b <= m || a == m && b <= n) {
                    f = true;
                    break;
                }
            }
        }
        if (f) System.out.println("YES");
        else System.out.println("NO");
    }

    static int max(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }
}