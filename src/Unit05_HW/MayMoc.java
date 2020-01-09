/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class MayMoc {

    private String tenMay;
    private String khoiLuong;
    private int namSX;
    private int congSuat;
    private String mauSac;

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public void setKhoiLuong(String khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTenMay() {
        return tenMay;
    }

    public String getKhoiLuong() {
        return khoiLuong;
    }

    public int getNamSX() {
        return namSX;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập Tên máy:");
        tenMay = sc.nextLine();
        System.out.print("Mời bạn nhập khối lượng:");
        khoiLuong = sc.nextLine();
        System.out.print("Mời bạn nhập màu sắc:");
        mauSac = sc.nextLine();
        System.out.print("Mời bạn nhập năm sản xuất:");
        namSX = sc.nextInt();
        System.out.print("Mời bạn nhập công xuất:");
        congSuat = sc.nextInt();
    }
    public void intTT() {
        System.out.println("Tên Máy:" + tenMay);
        System.out.println("Khối lượng:" + khoiLuong);
        System.out.println("Màu Sắc:" + mauSac);
        System.out.println("Năm sản xuất:" + namSX);
        System.out.println("Công Xuất:" + congSuat);

    }
}
