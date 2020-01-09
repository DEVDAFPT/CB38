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
public class HW_4_3 {

    public static void main(String[] args) {
        for (int i = 8, k = 0; i > 0 && k < 8; i--, k++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }
}
