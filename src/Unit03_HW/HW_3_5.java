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
public class HW_3_5 {

    public static void main(String[] args) {
//        KIỂM TRA PHẦN TU CHẴN LẺ TRONG MẢNG 
        int n, i;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arr[] = new int[n];
        int le[] = new int[n];
        int chan[] = new int[n];
        int d = 0;
        int b = 0;
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                chan[b] = arr[i];
                b++;
            } else {
                le[d] = arr[i];
                d++;
            }
        }
        System.out.print("Danh sách phần tử chẵn là: ");
        for (i = 0; i < b; i++) {
            System.out.print(chan[i] + "\t");
        }
        System.out.println("\n");
        System.out.print("Danh sách phần tử lẻ là: ");
        for (i = 0; i < d; i++) {
            System.out.print(le[i] + "\t");
        }
    }
}
