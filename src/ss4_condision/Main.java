package ss4_condision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập vào điểm => Xếp loại sinh viên
        /*
        điểm < 5: Yếu
        điểm: [5-7): Khá
        Điểm: [7-8.5): Giỏi
        Điểm: 8-10: Xuất sac
         */
//        double score = 4;
        // Cách 1: Cách thiếu nhi
//        if(score < 5) {
//            System.out.println("Yếu");
//        }
//
//        if(score >= 5 && score < 7) {
//            System.out.println("Khá");
//        }
//        if(score >= 7 && score < 8.5) {
//            System.out.println("Giỏi");
//        }
//
//        if(score >= 8.5 && score <= 10) {
//            System.out.println("Xuat xac");
//        }
//
//        // Cách 2: Cách người trưởng thành
//        if(score < 5) {
//            System.out.println("Yếu");
//        } else if(score >= 5 && score < 7) {
//            System.out.println("Khá");
//        } else if(score >= 7 && score < 8.5) {
//            System.out.println("Giỏi");
//        } else if(score >= 8.5 && score <= 10) {
//            System.out.println("Xuat xac");
//        }

        // Cách 3
        double score = 12;
        if (score < 0 || score > 10) {
            System.out.println("Diem khong hop le");
        } else if (score < 5) {
            System.out.println("Yếu");
        } else if (score < 7) {
            System.out.println("Khá");
        } else if (score < 8.5) {
            System.out.println("Giỏi");
        } else {
            System.out.println("Xuat xac");
        }
        // Thực hiện tiếp chương trình

        /*
        điểm < 5: ở lại
        điểm: >= 5: Lên lớp
         */
//        if (score <= 5) {
//            System.out.println("Ở lại lớp!!!");
//        } else {
//            System.out.println("Lên lớp");
//        }
    }
}
