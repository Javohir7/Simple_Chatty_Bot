import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        s=s.replaceAll("a", "b");
        System.out.println(s);
    }
}