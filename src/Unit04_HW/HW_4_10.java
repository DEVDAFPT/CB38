/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_4_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        System.out.println("Input size of array");
        int n = sc.nextInt();
        int tong = 0;
        int tB = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Dãy số nguyên là: ");
        for (int i = 0; i <= n; i++) {
            tong += arr[i];
            tB = tong / n;
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("Trung bình dãy số là: "+tB);
    }
}
