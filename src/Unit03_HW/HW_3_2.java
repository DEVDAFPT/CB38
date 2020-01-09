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
public class HW_3_2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào bán kính r = ");
        double r = input.nextDouble();
        System.out.println("Diện tích hình tròn với bán kính r = " + r + " là: " + tinhDienTich(r));
    }

    public static double tinhDienTich(double r) {
        return (r * r * Math.PI); //trả về kết quả theo công thức tính diện tích hình tròn
    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float r = sc.nextFloat();
//        dienTich((int) r);
//    }
//
//    public static float dienTich(int r) {
//        float s =(float) (3.14 * (r*r));
//        return s;
//    }
}
