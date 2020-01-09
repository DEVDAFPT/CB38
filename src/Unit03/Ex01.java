/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex01 {

    public static void main(String[] args) {
        String mang[] = new String[6];
        for (int i = 0; i < mang.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap gia tri thu" + (i + 1) + ":");
            mang[i] = sc.nextLine();
        }
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
    }
}
