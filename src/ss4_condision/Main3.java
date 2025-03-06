package ss4_condision;

public class Main3 {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            default:
                System.out.println("Nhập sai giá trị");
        }

        // Cách 2
        switch (day) {
            case 1 -> System.out.println("Chủ nhật");
            case 2 -> System.out.println("Thứ 2");
            case 3 -> System.out.println("Thứ 3");
            default -> System.out.println("Nhập sai giá trị");
        }
    }
}