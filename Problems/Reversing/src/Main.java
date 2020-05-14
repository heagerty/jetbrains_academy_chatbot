import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String s1 = scanner.next();
        int len = s1.length();
        if (s1.charAt(len-1) != '0') {
            System.out.print(s1.charAt(len-1));
        }
        for (int i = 1; i < len ; i++) {
            System.out.print(s1.charAt(len-1-i));
        }
    }
}