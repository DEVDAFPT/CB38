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
public class HW_4_6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if ((i == 1) || (i == 5)) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("#\t");
                }
                System.out.println("\n");
            } else {
                for (int j = 1; j < i; j++) {
                    System.out.print("\t");
                }
                System.out.println("#\n");
            }
        }
    }
}
