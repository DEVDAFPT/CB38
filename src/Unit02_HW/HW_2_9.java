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
public class HW_2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        float n = sc.nextFloat();
        float tong = 0;
        float GT = 1;
        for (float i = 1; i <= n; i++) {
            GT *= i;
            tong = i / GT;
        }
        System.out.println("ket qua= " + tong);
    }
}
