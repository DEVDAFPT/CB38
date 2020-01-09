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
public class HW_3_4 {

    public static void main(String[] args) {
//        SẮP XẾP KIỂU SELECTION SORT
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        System.out.println("Input size of arr: ");
        int n = sc.nextInt();
        int t;
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i + "] ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
