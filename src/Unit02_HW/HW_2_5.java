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
public class HW_2_5 {
     public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập number a:");
        float a = number.nextFloat();
        System.out.println("Nhập number b:");
        float b = number.nextFloat();
        float c;
        System.out.println("Phương trình nhập vào là :" + a + "x+" + b + "=0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương Trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô ngiệm");
            }
        } else {
             c =(float) (-b/a);
            System.out.println("Nghiệm của phương trình là x = "+c+"");
        }
    }
}
