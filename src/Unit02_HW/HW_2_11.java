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
public class HW_2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size n:");
        int n = sc.nextInt();
        float tong = 0;
        for (float i = 1; i < n; i++) {
            tong = tong +(float) (1/i);
        }
        System.out.println("Ket qua = "+tong);
    }
}
