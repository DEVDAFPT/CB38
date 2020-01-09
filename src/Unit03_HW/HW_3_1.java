/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_3_1 {
//    In ra tên tháng bằng cách nhập 1-12

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int a = sc.nextInt();
        kiemTra(a);
    }

    public static int kiemTra(int a) {
        switch (a) {
            case 1: {
                System.out.println("Tháng 1");
                break;
            }
            case 2: {
                System.out.println("Tháng 2");
                break;
            }
            case 3: {
                System.out.println("Tháng 3");
                break;
            }
            case 4: {
                System.out.println("Tháng 4");
                break;
            }
            case 5: {
                System.out.println("Tháng 5");
                break;
            }
            case 6: {
                System.out.println("Tháng 6");
                break;
            }
            case 7: {
                System.out.println("Tháng 7");
                break;
            }
            case 8: {
                System.out.println("Tháng 8");
                break;
            }
            case 9: {
                System.out.println("Tháng 9");
                break;
            }
            case 10: {
                System.out.println("Tháng 10");
                break;
            }
            case 11: {
                System.out.println("Tháng 11");
                break;
            }
            case 12: {
                System.out.println("Tháng 12");
                break;
            }
            default: {
                System.out.println("khong hop le");
            }

        }
        return a;
    }
}
