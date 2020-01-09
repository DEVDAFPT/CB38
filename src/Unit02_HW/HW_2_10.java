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
public class HW_2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int GT = 1;
        if (n == 0) {
            System.out.println("Giai thua cua 0 = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                GT = GT * i;
            }
            System.out.println(n + "! = " + GT);
        }
    }
}
