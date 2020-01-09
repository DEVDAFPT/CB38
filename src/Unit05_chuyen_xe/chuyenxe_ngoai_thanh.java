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
public class chuyenxe_ngoai_thanh extends chuyenXe{
    private String noiDen;
    private String soNgay;
    public void setNoiDen(String noiDen){
        this.noiDen = noiDen;
    }
     public void setSoNgay(String soNgay){
        this.noiDen = soNgay;
    }
     public String getNoiDen(){
         return noiDen;
     }
      public String getSoNgay(){
         return soNgay;
     }
       public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập nơi đến: ");
        noiDen= sc.nextLine();
        System.out.print("Mời bạn nhập số ngày:");
        soNgay= sc.nextLine();
        super.nhapTT();
       }
        public void intTT() {
        System.out.println("Nơi Đến:" + noiDen);
        System.out.println("Số Ngày:" + soNgay);
        super.intTT();
        }
   
}
