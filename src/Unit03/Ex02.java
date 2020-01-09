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
public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[2][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("array[" + i + "]array[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
