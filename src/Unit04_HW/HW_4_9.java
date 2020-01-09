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
public class HW_4_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[101];
        System.out.println("Input size of array");
        int n = sc.nextInt();
        int max = 0;
        int chiMuc = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]= ");
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Nhập giá trị >0 arr[" + i + "]= ");
                arr[i] = sc.nextInt();
            }
        }
        max = arr[0];
        for (int i = 0; i <= n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                chiMuc = i;
            }
        }
        System.out.println("Số lớn nhất là: " + max + " và chỉ mục tại arr[" + chiMuc + "]");
    }
}
