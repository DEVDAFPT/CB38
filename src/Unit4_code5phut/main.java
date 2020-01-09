/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4_code5phut;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        sinhVien zent_sv = new sinhVien("Ducanh",140777,"codebase","fpt","hanoi");
        System.out.println(zent_sv.getHoTen());
        System.out.println(zent_sv.getMaSV());
        System.out.println(zent_sv.getLop());
        System.out.println(zent_sv.getTruong());
        System.out.println(zent_sv.getque());
//        zent_sv.setHoTen("Nguyễn Đức Anh");
//        các thuộc tính tương tự như trên
//        System.out.println(zent_sv.getHoTen());
//        zent_sv.nhapTT();
//        zent_sv.intTT();
//        zent_sv.run();
    }
}
