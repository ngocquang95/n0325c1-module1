package ss3_java_overview;

import java.util.Scanner;

// Ctrl + Alt + L
public class Main5 {
    public static void main(String[] args) {
        // System.in): Tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = Integer.parseInt(scanner.nextLine()); // 18 enter

        System.out.print("Nhập vào tên của bạn: ");
        // scanner.nextLine(); // xóa hết toàn bộ dữ liệu ở trong bộ nhớ đệm scanner (dấu enter)
        String name = scanner.nextLine();

        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Tên của bạn là: " + name);
    }
}
