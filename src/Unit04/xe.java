/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xe {
    private String tenXe;
    private String hangXe;
    private int soCho;
    private int namSX;
    private String mauSac;
    public void chay(){
        System.out.println("Đây là phương thức của xe");
    }
//    set
    public void setTenXe(String tenXe){
        this.tenXe = tenXe;
    }
    public void  setHangXe(String hangXe){
        this.hangXe = hangXe;
    }
//    get
    public String getTenXe(){
        return tenXe;
    }
    public String getHangXe(){
        return hangXe;
    }
//    Khởi Tạo
    public xe(){
        
    }
    public xe(String tenXe){
        this.tenXe= tenXe;
    }
    public xe(String tenXe, String hangXe, int soCho){
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.soCho = soCho;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin");
        System.out.print("Mời bạn nhập tên xe:");
        tenXe = sc.nextLine();
        System.out.print("Mời bạn nhập hãng xe:");
        hangXe = sc.nextLine();
        System.out.print("Mời bạn nhập màu sắc xe:");
        mauSac = sc.nextLine();
        System.out.print("Mời bạn nhập số chỗ:");
        soCho = sc.nextInt();
        System.out.print("Mời bạn nhập năm sản xuất:");
        namSX = sc.nextInt();

    }
    public void intTT(){
        System.out.println("Teen xe:"+tenXe);
        System.out.println("Teen xe:"+hangXe);
        System.out.println("Teen xe:"+mauSac);
        System.out.println("Teen xe:"+soCho);
        System.out.println("Teen xe:"+namSX);
                
    }
}

