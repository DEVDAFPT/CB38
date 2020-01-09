/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4_code5phut;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sinhVien {

    private String hoTen;
    private int maSV;
    private String lop;
    private String truong;
    private String que;

    public sinhVien() {

    }

    public sinhVien(String hoTen, int maSV, String lop, String truong, String que) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.truong = truong;
        this.que = que;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTruong() {
        return truong;
    }

    public String getque() {
        return que;
    }
    public void run(){
        System.out.println("Running method of sinhVien");
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin");
        System.out.print("Mời bạn nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        lop = sc.nextLine();
        System.out.print("Mời bạn nhập tên trường: ");
        truong  = sc.nextLine();
        System.out.print("Mời bạn nhập quê: ");
        que = sc.nextLine();
        System.out.print("Mời bạn nhập mã sinh viên: ");
        maSV = sc.nextInt();

    }
    public void intTT(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Mã Sinh Viên: "+maSV);
        System.out.println("Tên lớp: "+lop);
        System.out.println("Tên Trường:"+truong);
        System.out.println("Quê Quán:"+que);
                
    }

}
