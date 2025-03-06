package ss4_condision;

public class Main4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // Tìm min và max
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        int max2 = a > b ? a : b;
        int min = a < b ? a : b;
        int min2 = Math.min(a, b);
    }
}
