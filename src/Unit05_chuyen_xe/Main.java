/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_chuyen_xe;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("|---------------------------------------------------|");
        System.out.println("|                 ĐÂY LÀ MENU OKE KHÔNG?            |");
        System.out.println("|-------------------Nhập in thông tin---------------|");
        System.out.println("|  Chuyến xe Nội Thành  |  Chuyến xe ngoại thành    |");
        System.out.println("|        -1-                       -2-              |");
        System.out.println("|------------------Click 3 to exit!-----------------|");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn thích đi còn chờ gì nữa!");
        int n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.print("Số chuyến xe chạy:");
                int a = sc.nextInt();
                chuyenxe_noi_thanh arr_NT[] = new chuyenxe_noi_thanh[a];
                for (int i = 0; i < arr_NT.length; i++) {
                    arr_NT[i] = new chuyenxe_noi_thanh();
                    System.out.println("Mời bạn nhập chuyến xe thứ "+(i+1)+": ");
                    arr_NT[i].nhapTT();
                }
                System.out.println("+-----+-------------+------------------+----------------------+---------------+-------------+");
                    System.out.println("|                               DANH SÁCH XE NỘI THÀNH                                    |");
                    System.out.println("+-----+-------------+------------------+----------------------+---------------+-------------+");
                    System.out.println("| STT |  MS chuyến  |  Họ tên lái xe   |  Số xe  |  Số tuyến  |  Quãng đường  |  Doanh thu  |");
                    for (int i = 0; i < a; i++) {
                        System.out.printf("|%5s|%13s|%17s|%9s|%12s|%15s|%13f|\n", i + 1, arr_NT[i].getMSchuyen(), arr_NT[i].getNametaixe(), arr_NT[i].getSoxe(), arr_NT[i].getSoTuyen(), arr_NT[i].getSoKM(), arr_NT[i].getDoanhThu());
                    }
                    System.out.println("+-----+-------------+------------------+---------+------------+---------------+-------------+");
                
                break;
            case 2:
                 System.out.print("Số chuyến xe chạy:");
                int b = sc.nextInt();
                chuyenxe_ngoai_thanh arr_NgT[] = new chuyenxe_ngoai_thanh[b];
                for (int i = 0; i < arr_NgT.length; i++) {
                    arr_NgT[i] = new chuyenxe_ngoai_thanh();
                    System.out.println("Mời bạn nhập chuyến xe thứ "+(i+1)+": ");
                    arr_NgT[i].nhapTT();
                }
                System.out.println("+-----+-------------+------------------+----------------------+---------------+-------------+");
                    System.out.println("|                               DANH SÁCH XE NGOAI THÀNH                                    |");
                    System.out.println("+-----+-------------+------------------+----------------------+---------------+-------------+");
                    System.out.println("| STT |  MS chuyến  |  Họ tên lái xe   |  Số xe  |  Nơi Đến  |  Số Ngày  |  Doanh thu  |");
                    for (int i = 0; i < b; i++) {
                        System.out.printf("|%5s|%13s|%17s|%9s|%12s|%15s|%13f|\n", i + 1, arr_NgT[i].getMSchuyen(), arr_NgT[i].getNametaixe(), arr_NgT[i].getSoxe(), arr_NgT[i].getNoiDen(), arr_NgT[i].getSoNgay(), arr_NgT[i].getDoanhThu());
                    }
                    System.out.println("+-----+-------------+------------------+---------+------------+---------------+-------------+");
                
                
                break;
            case 3:
                System.exit(0);
                break;
            
        }
    }
}
