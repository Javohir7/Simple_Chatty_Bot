import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            int a = sc.nextInt();
            ans += a;
            if (a == 0) break;
        }
        System.out.println(ans);
    }
}