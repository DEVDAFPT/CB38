/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03;

/**
 *
 * @author Admin
 */
public class Ex03 {
    public static void main(String[] args) {
        tinhTong(10,20);
        System.out.println("sum="+(tinhTong2(10,20)+40));
        System.out.println("tong="+(tinhTong2(10,20)+40));
    }
    public static void tinhTong(int a, int b){
        System.out.println("Sum="+(a+b));
    }
    public static int tinhTong2(int a, int b){
        int tong=(a+b);
        return tong;
    }
//    public static void main(String[] args) {
//        infor("duc anh","fpt");
//        infor("dat","zent");
//    }
//    public static void infor(String name, String school){
//        System.out.println("xin chao "+name+"Dang hoc"+school);
//    }
}
