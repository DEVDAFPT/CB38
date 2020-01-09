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
public class HW1_4 {
    public static void main(String[] args) {
        Scanner input_number = new Scanner(System.in);
        System.out.println("Input Number a: ");
        int a = input_number.nextInt();
        System.out.println("Input Number b: ");
        int b = input_number.nextInt();
        int c = a > b ? a:b;
        System.out.println("Số lớn hơn là : "+c+"");
    }
}
