/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex01 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so:");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "la so chan");
        } else {
            System.out.println(number + "la so le");
        }

    }

}
