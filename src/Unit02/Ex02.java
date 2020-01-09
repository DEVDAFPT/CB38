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
public class Ex02 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        number = sc.nextInt();
        if (number == 2) {
            System.out.println("Hom nay la thu hai");
        } else if (number == 3) {
            System.out.println("hom nay la thu ba");
        } else if (number == 4) {
            System.out.println("hom nay la thu tu");
        } else if (number == 5) {
            System.out.println("hom nay la thu nam");
        } else if (number == 6) {
            System.out.println("hom nay la thu sau");
        } else if (number == 7) {
            System.out.println("hom nay la thu bay");
        } else if (number == 8) {
            System.out.println("hom nay la chu nhat");
        } else {
            System.out.println("Hom nay la....loading99%");
        }

    }
}
