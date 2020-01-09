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
public class HW_2_1 {
        public static void main(String[] args) {
        int n;
        int phanTu;
        int tong=0;
        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhap so phan tu cua day n= ");
                n = sc.nextInt();
                if(n<=0){
                    System.out.println("Ban phai nhap gia tri n>0:");
            }
            } while (n<=0);
            for (int i = 1; i <= n; i++) {
                System.out.println("Nhập phần tu thứ"+i+"=");
                phanTu = sc.nextInt();
                if(phanTu%4==0||(phanTu/100)<=9&&phanTu%100==3){
                    tong+=phanTu;
                }
            }
            System.out.println("Ket qua: "+tong);
            
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int n;
//        int phanTu;
//        int tong = 0;
//        do {
//            System.out.print("Nhập số phần tử của dãy:");
//            n = input.nextInt();
//            if (n <= 0) {
//                System.out.println("Bạn phải nhập giá trị n>0");
//            }
//        } while (n <= 0);
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + " = ");
//            phanTu = input.nextInt();
//            if (phanTu % 4 == 0||((phanTu / 100) <= 9 && phanTu % 100 == 3)) {  
//                    tong += phanTu;               
//            }
//        }
//         System.out.println("Ket Qua= " + tong);
//    }
}
