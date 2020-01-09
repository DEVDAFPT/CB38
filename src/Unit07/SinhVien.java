/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ten;
    private int old;
    private String school;

    public SinhVien() {
    }

    public SinhVien(String ten, int old, String school) {
        this.ten = ten;
        this.old = old;
        this.school = school;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return this.ten + "-" + this.old + "-" + this.school;
    }
    
    
}
