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
public class Ex03 {

    public static void main(String[] args) {
        int a = 10, b = 0;
        System.out.println("Start");
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("Lỗi: "+ e.getLocalizedMessage());
        }
        System.out.println("End");
    }
}
