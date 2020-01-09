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
public class chuyenXe {

    private String msChuyen;
    private String nameTaiXe;
    private String soXe;
    private float doanhThu;

    public void setMSchuyen(String msChuyen) {
        this.msChuyen = msChuyen;
    }

    public void setnameTaixe(String nameTaiXe) {
        this.nameTaiXe = nameTaiXe;
    }

    public void setsoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getMSchuyen() {
        return msChuyen;
    }

    public String getNametaixe() {
        return nameTaiXe;
    }

    public String getSoxe() {
        return soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập Tên tài xế:");
        nameTaiXe = sc.nextLine();
        System.out.print("Mời bạn nhập mã số chuyến:");
        msChuyen = sc.nextLine();
        System.out.print("Mời bạn nhập số xe:");
        soXe = sc.nextLine();
        System.out.print("Mời bạn nhập doanh thu:");
        doanhThu = sc.nextInt();

    }

    public void intTT() {
        System.out.println("Mã số chuyến:" + msChuyen);
        System.out.println("Tên tài xế:" + nameTaiXe);
        System.out.println("Số xe:" + soXe);
        System.out.println("Doanh thu:" + doanhThu);

    }

}
