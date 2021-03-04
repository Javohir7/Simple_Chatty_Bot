import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        BigInteger ans = new BigInteger("1");
        for (int i = a; i < b; i++) {
            ans = BigInteger.valueOf(i).multiply(ans);
        }
        System.out.println(ans);
    }
}
