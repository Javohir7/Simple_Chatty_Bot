import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > 0 && b <= 0 && c <= 0 || b > 0 && a <= 0 && c <= 0 || c > 0 && b <= 0 && a <= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}