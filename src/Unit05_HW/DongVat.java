/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW;

/**
 *
 * @author Admin
 */
public abstract class DongVat {

    private String ten;
    private String loai;
    private int soChan;
    private String thucAn;
    private int chieuCao;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getTen() {
        return ten;
    }

    public String getLoai() {
        return loai;
    }

    public String getThucAn() {
        return thucAn;
    }

    public int getSoChan() {
        return soChan;
    }

    public int getChieuCao() {
        return chieuCao;
    }
}
