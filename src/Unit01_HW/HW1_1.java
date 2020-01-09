/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW1_1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập number a:");
        int a = number.nextInt();
        System.out.println("Nhập number b:");
        int b = number.nextInt();
        System.out.println("Phương trình nhập vào là :" + a + "x+" + b + "=0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương Trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô ngiệm");
            }
        } else {
            float c = (-b/a);
            System.out.println("Nghiệm của phương trình là x = "+c+"");
        }
    }
}
