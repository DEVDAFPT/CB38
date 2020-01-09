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
public class Ex03 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        number = sc.nextInt();
        switch (number) {
            case 2: {
                System.out.println("hom nay la thu hai");
                break;
            }
            case 3: {
                System.out.println("hom nay la thu ba");
                break;
            }
            case 4: {
                System.out.println("hom nay la thu tu");
                break;
            }
            case 5: {
                System.out.println("hom nay la thu nam");
                break;
            }
            case 6: {
                System.out.println("hom nay la thu sau");
                break;
            }
            case 7: {
                System.out.println("hom nay la thu bay");
                break;
            }
            case 8: {
                System.out.println("hom nay la chu nhat");
                break;
            }
            default: {
                System.out.println("khong hop le");
            }

        }
    }
}
