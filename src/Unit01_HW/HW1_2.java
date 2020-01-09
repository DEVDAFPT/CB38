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
public class HW1_2 {

    public static void main(String[] args) {
        Scanner nhap_so = new Scanner(System.in);
        System.out.println("Nhập số a:");
        int a = nhap_so.nextInt();
        System.out.println("Nhập số b:");
        int b = nhap_so.nextInt();
        System.out.println("Tổng của hai số là: " + (a + b));
        System.out.println("Hiệu của hai số là: " + (a - b));
        System.out.println("Tích của hai số là: " + (a * b));
        System.out.println("Thương của hai số là: " + (a / b));
        System.out.println("Chia phần dư của hai số là: " + (a % b));
    }
}
