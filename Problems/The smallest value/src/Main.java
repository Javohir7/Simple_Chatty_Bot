import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = 1, ans = 1;
        while (ans <= n) {
            ans *= k++;
        }
        System.out.println(--k);

    }
}