/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_4_7 {
     public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập giá trị n <Nên nhập n là số lẻ>:");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập n lớn hơn 0.");
            }
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == j || (i + j) == n - 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n\n");
        }
    }

//    public static void main(String[] args) {
//        int n, i, j, t, d, d2;
//
//        n = 7;
//        d = n - 2;
//        d2 = n / 2 + 1;
//
//        for (i = 1; i <= n; ++i) {
//            if (i == 1 || i == n) {
//                for (j = 1; j <= n; ++j) {
//                    System.out.println("#\t");
//                }
//                System.out.println("\n");
//            } else if (i <= n / 2 + 1) {
//                t = d;
//                for (j = 1; j < i; ++j) {
//                    System.out.println("\t");
//                }
//                t = t - i + 1;
//                System.out.println("#");
//
//                for (j = 1; j <= t; ++j) {
//                    System.out.println("\t");
//                }
//                if (t) {
//                } else {
//                    System.out.println("#");
//                    System.out.println("\n");
//                    d--;
//                }
//            } else {
//                t = d2;
//
//                for (j = 1; j <= d; ++j) {
//                    System.out.println("\t");
//                }
//                t -= d;
//                System.out.println("#");
//
//                for (j = 1; j <= t; ++j) {
//                    System.out.println("\t");
//                }
//                System.out.println("#\n");
//
//                d--;
//                d2++;
//            }
//        }
//
//    }
}
