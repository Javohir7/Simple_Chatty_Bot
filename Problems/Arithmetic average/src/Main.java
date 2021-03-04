import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0;
        double ans = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        while (a % 3 != 0) {
            a++;
        }
        while (b % 3 != 0) {
            b--;
        }

        count = (b - a) / 3 + 1;
        ans = ((a + b) / 2.0);
        if (a > b) ans = 0;
        System.out.println(ans);
    }
}