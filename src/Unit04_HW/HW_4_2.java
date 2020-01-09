/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

/**
 *
 * @author Admin
 */
public class HW_4_2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 7 - (i - 1); j++) {
                System.out.print("#\t");
            }
            System.out.println("\n");
        }
    }
}
