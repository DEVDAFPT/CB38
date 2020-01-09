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
public class HW_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int a = sc.nextInt();
        kiemTra(a);
    }
    public static int kiemTra(int a){
        if(a%2==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return a;
    }
}
