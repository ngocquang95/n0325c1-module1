package ss5_loop;

public class Main2 {
    public static void main(String[] args) {

        int n = 10;

        // Cách 1
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }

        // Cách 2
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
