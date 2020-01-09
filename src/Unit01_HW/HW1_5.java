/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW1_5 {

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 ");
        Scanner input_number = new Scanner(System.in);
        System.out.println("Input number a=");
        float a = input_number.nextFloat();
        System.out.println("Input number b=");
        float b = input_number.nextFloat();
        System.out.println("Input number c= ");
        float c = input_number.nextFloat();
        System.out.println("Phương trình được nhập vào là:" + a + "x^2+" + b + "+" + c + "=0");
        float delta = b * b - 4 * a * c;
        float x1, x2;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            if (delta == 0) {

                x1 = x2 = -b / 2 * a;
                System.out.println("Phương trình có nghiệm kép là: " + x1 + "");
            } else {
                if (delta > 0) {
                    x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                    x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                    System.out.println( "Phương trình có 2 nghiệm phân biệt là:" + x1 + " và "+x2+"");
                }
            }
        }

    }
}
///*
// Viết chương trình giải phương trình bậc hai: ax^2 + bx + c = 0 
// Xét đầy đủ các trường hợp
// */
//package Unit02_HW;
//
//import java.util.Scanner;
//
///**
// *
// * @author Zent Group
// */
//public class Ex02 {
//
//    public static void main(String[] args) {
//        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC HAI");
//        Scanner sc = new Scanner(System.in);
//
//        //Nhập hệ số
//        System.out.print("Nhập hệ số a=");
//        double a = sc.nextFloat();
//        System.out.print("Nhập hệ số b=");
//        double b = sc.nextFloat();
//        System.out.print("Nhập hệ số c=");
//        double c = sc.nextFloat();
//        double delta, x1, x2;
//
//        if (a == 0) {
//            if (b == 0) {
//                if (c == 0) {
//                    System.out.println("Phương trình có vô số nghiệm.");
//                } else {
//                    System.out.println("Phương trình vô nghiệm.");
//                }
//            } else {
//                x1 = (-c / b);
//                System.out.println("Phương trình có nghiệm duy nhất x= " + x1);
//            }
//        } else {
//            delta = (b * b) - (4 * a * c);
//            if (delta < 0) {
//                System.out.println("Phương trình vô nghiệm.");
//            } else if (delta == 0) {
//                x1 = ((-b) / (2 * a));
//                System.out.println("Phương trình có nghiệm kép x1=x2= " + x1);
//            } else {
//                x1 = (((-b) + Math.sqrt(delta)) / (2 * a));
//                x2 = (((-b) - Math.sqrt(delta)) / (2 * a));
//                System.out.println("Phương trình có 2 nghiệm phân biệt:");
//                System.out.println("x1= " + x1);
//                System.out.println("x2= " + x2);
//            }
//        }
//    }
//}
