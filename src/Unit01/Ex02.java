/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner nhap_phim = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên:");
        String name = nhap_phim.nextLine();
        System.out.println("Bạn đang học trường:");
        String school = nhap_phim.nextLine();
        System.out.println("Mời bạn nhập tuổi:");
        int old = nhap_phim.nextInt();
        System.out.println("Tên của bạn là "+name+"");
        System.out.println("Năm nay bạn"+old+"");
        System.out.println("Bạn đang học trường"+school+"");
    }
}
