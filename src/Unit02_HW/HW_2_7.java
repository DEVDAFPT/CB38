/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02_HW;

/**
 *
 * @author Admin
 */
public class HW_2_7 {

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 7 == 0) {
                    n++;
                    System.out.println("So luong so nguyen chia het cho 3 va 7 la: " + n);
                }
            }
        }
    }
}
