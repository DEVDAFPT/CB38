/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String ID, hoVaTen, email, gioiTinh, queQuan;
    private String sdt, namSinh;

    public NhanVien() {
    }

    public NhanVien(String ID, String hoVaTen, String email, String gioiTinh, String queQuan, String sdt, String namSinh) {
        this.ID = ID;
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.sdt = sdt;
        this.namSinh = namSinh;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ và tên:");
        hoVaTen = sc.nextLine();
        System.out.println("Mời bạn nhập email:");
        email = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính:");
        gioiTinh = sc.nextLine();
        System.out.println("Mời bạn nhập quê quán:");
        queQuan = sc.nextLine();
        System.out.println("Mời bạn nhập ID:");
        ID = sc.nextLine();
        System.out.println("Mời bạn nhập số điện thoại:");
        sdt = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh:");
        namSinh = sc.nextLine();

    }
    public void inTT(){
        System.out.println("ID: "+ID);
        System.out.println("Họ và Tên: "+hoVaTen);
        System.out.println("Giới Tính: "+gioiTinh);
        System.out.println("Email: "+email);
        System.out.println("Số điện thoại: "+sdt);
        System.out.println("Năm Sinh: "+namSinh);
        System.out.println("Quê quán: "+queQuan);
    }

    @Override
    public String toString() {
        return this.ID+ this.hoVaTen + this.namSinh;
    }

}
