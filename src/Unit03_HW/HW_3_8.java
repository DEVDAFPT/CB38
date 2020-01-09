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
public class HW_3_8 {

    public static void main(String[] args) {
//        ĐẾM SỐ LẦN XUẤT HIỆN CỦA PHẦN TỬ TRONG MẢNG 
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        System.out.println("Input size of arr: ");
        int n = sc.nextInt();
        int soLan=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ[" + i + "] là: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Phần tử cần đếm là: ");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==k){
                soLan++;
            }           
        }
        System.out.println("Số "+k+" xuất hiện "+soLan+" lần");
    }
}
