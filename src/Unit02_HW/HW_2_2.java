/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập khoảng N: ");
        int N = sc.nextInt();
        System.out.println("Nhập khoảng M: ");
        int M = sc.nextInt();
        System.out.println("Nhập số K: ");
        int K = sc.nextInt();
        int tong = 0;
        if (M >= N) {
            for (int i = N; i <= M; i++) {
                if (i % K == 0) {
                    tong += i;
                }
            }
            System.out.println("Ket qua la:" + tong);
        }
    }
}
