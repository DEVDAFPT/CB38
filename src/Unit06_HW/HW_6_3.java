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
public class HW_6_3 {
     public String chuanHoaKhoangTrang(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+"," "); // sử dụng \\s+ đại diện cho khoảng trắng.
        return str;
    }

    public String chuanHoaVietHoa(String str) {
        str = chuanHoaKhoangTrang(str);
        String arr[] = str.split(" ");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            if (i < arr.length - 1) {
                str += " ";
            }
            if (i == arr.length - 1) {
                str += ".";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuỗi họ tên cần chuẩn hóa: ");
        str = input.nextLine();
        HW_6_3 chuanhoa = new HW_6_3();
        System.out.println(chuanhoa.chuanHoaVietHoa(str));

    }

//    public String chuanHoa(String c) {
//        c = c.trim();
//        c = c.replaceAll("\\s+", " ");
//        return c;
//    }
//
//    public String chuanHoaDanhTuRieng(String c) {
//        c = chuanHoa(c);
//        String temp[] = c.split(" ");
//        c = "";
//        for (int i = 0; i < temp.length; i++) {
//            c += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
//            if (i < temp.length - 1)
//            {
//                c += " ";
//            }
//        }
//        return c;
//    }
//
//    public static void main(String[] sgr) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi:");
//        String c = sc.nextLine();
//        HW_6_3 chx = new HW_6_3();
//        c = chx.chuanHoaDanhTuRieng(c);
//        System.out.println(c);
//    }

}
