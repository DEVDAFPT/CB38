/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_2_3 {
public static void main(String[] args) {
        System.out.println("ĐẾM SỐ ÂM, DƯƠNG");
        Scanner input = new Scanner(System.in);

        int n;
        int phanTu;
        int demDuong = 0;
        int demAm = 0;
        int demKhong = 0;
        do {
            System.out.print("Nhập số phần tử của dãy:");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập giá trị n>0");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " = ");
            phanTu = input.nextInt();
            if (phanTu == 0) {
                demKhong++;
            }
            if (phanTu < 0) {
                demAm++;
            }
            if (phanTu > 0) {
                demDuong++;
            }

        }
        System.out.println("KẾT QUẢ");
        System.out.println("Có " + demKhong + " số 0 trong dãy đã nhập.");
        System.out.println("Có " + demAm + " số âm trong dãy đã nhập.");
        System.out.println("Có " + demDuong + " số dương trong dãy đã nhập.");
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input n: ");
//        int n = sc.nextInt();
//        int am = 0;
//        int khong = 0;
//        int duong = 0;
//        if (n < 0) {
//            am++;
//        }else{
//            if(n>0){
//                duong++;
//            }else{
//                khong++;
//            }               
//        }
//        System.out.println("Dem so khong:" + khong);
//        System.out.println("Dem so le:" + am);
//        System.out.println("Dem so chan:" + duong);
//    }
}
