/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HW_6_2 {
     public boolean checkplaindrome(String str) {
        if (str.length() < 2) {
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)) { //so sánh kí tự đầu tiên và kí tự cuối cùng
                return false;
            }
            return checkplaindrome(str.substring(1, str.length() - 1));  //Sau mỗi lần so sánh thì cắt bỏ kí tự đầu cuối đi và tiếp tục so sánh
        }

    }

    public static void main(String[] args) {
        HW_6_2 check = new HW_6_2();
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        str = input.nextLine();
        if (check.checkplaindrome(str) == true) {
            System.out.println("Chuỗi " + str + " là chuỗi plaindrome");
        } else {
            System.out.println("Chuỗi " + str + " là không phải là chuỗi plaindrome");
        }
    }

//    public static void main(String[] args) {
//        String chuoi;
//        char kyTu;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào chuỗi bất kỳ: ");
//        chuoi = scanner.nextLine();
//
//        for (int i = 0; i < chuoi.length(); i++) {
//            kyTu = chuoi.charAt(chuoi.length() - i - 1);
//            if (chuoi.charAt(i) == kyTu) {
//                System.out.println("Đây là chuỗi Panlyndrome.");
//                break;
//            } else{ 
//                System.out.println("Đây không phải chuỗi Panlyndrome.");
//                break;
//            }
//        }
//    }
}
