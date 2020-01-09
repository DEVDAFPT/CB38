/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<SinhVien> al = new ArrayList<>();
        SinhVien sv = new SinhVien("Đức Anh", 38 , "Zent");
        al.add(sv);
        System.out.println(al);
    }
}
