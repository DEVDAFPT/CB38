/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05;

/**
 *
 * @author Admin
 */
public abstract class mayMoc {
    String tenMau;
    String namSX;
    int congSuat;
//    phương thức thường
    public void chay(){
        System.out.println("Máy thì chạy");
    }
//    Phương thức trừu tượng
    public abstract void napNhienLieu();
}
