package ss4_condision;

public class Main2 {
    public static void main(String[] args) {
        int number = 2;

        if(number != 2) {
            System.out.println("Hello");
            System.out.println("Hello");
        }


        // Cach 1: Co {}
        if(number == 1) {
            System.out.println("One");
        } else if(number == 2) {
            System.out.println("Two");
        }

//        // Cach 2: Khong co {}
        if (number == 1)
            System.out.println("One");
        else if (number == 2)
            System.out.println("Two");
    }
}
