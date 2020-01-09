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
public class HW_2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a:");
        float a = sc.nextFloat();
        System.out.println("Input number b");
        float b = sc.nextFloat();
        System.out.println("Input number c");
        float c = sc.nextFloat();
        float delta, x1, x2;
        System.out.println("Phuong trinh nhap vao la: " + a + "x^2+" + b + "x+" + c + "");
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                x1 = (-c / b);
                System.out.println("Phuong trinh co nghiem duy nhat x= " + x1);
            }
        } else {
            delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem.");
            } else if (delta == 0) {
                x1 = ((-b) / (2 * a));
                System.out.println("phuong trinh co nghiem kep x1=x2= " + x1);
            } else {
                x1 = (float) (((-b) + Math.sqrt(delta)) / (2 * a));
                x2 = (float) (((-b) - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        }
    }
}
