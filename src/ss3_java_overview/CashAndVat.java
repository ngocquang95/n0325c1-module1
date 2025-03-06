package ss3_java_overview;

import java.util.Scanner;

public class CashAndVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bien so xe: ");
        int n = scanner.nextInt(); // 12345

        int sum = n % 10; // 5
        n /= 10; // 1234

        sum += n % 10; // 5 + 4 = 9
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n;

        int soNut = sum % 10;

        System.out.print("So nut: " + soNut);
    }
}