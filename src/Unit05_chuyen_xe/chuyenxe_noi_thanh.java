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
public class chuyenxe_noi_thanh extends chuyenXe{
    private String soTuyen;
    private String soKM;
    public void setSoTuyen(String soTuyen){
        this.soTuyen = soTuyen;
    }
     public void setSoKM(String soKM){
        this.soKM = soKM;
    }
     public String getSoTuyen(){
         return soTuyen;
     }
      public String getSoKM(){
         return soKM;
     }
       public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số Tuyến: ");
        soTuyen = sc.nextLine();
        System.out.print("Mời bạn nhập số Km:");
        soKM = sc.nextLine();
        super.nhapTT();
       }
        public void intTT() {
        System.out.println("Số tuyến:" + soTuyen);
        System.out.println("Số KM:" + soKM);
        super.intTT();
        }
    
}
