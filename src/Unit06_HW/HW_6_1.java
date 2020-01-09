/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_6_1 {

    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println(chuoi.charAt(0));
        System.out.println(chuoi.charAt(chuoi.length()-1));

    }
}
