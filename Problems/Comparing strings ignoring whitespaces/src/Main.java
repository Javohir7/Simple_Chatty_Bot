import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, ss1 = "", ss2 = "";
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') ss1 = ss1.concat(String.valueOf(s1.charAt(i)));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != ' ') ss2 = ss2.concat(String.valueOf(s2.charAt(i)));
        }
        System.out.println(ss1.equals(ss2));

    }
}