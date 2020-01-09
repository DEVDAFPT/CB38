/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Ex01 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Sơn");
        al.add("Đạt");
        al.add("Thành Đạt");
        al.add("An");
        System.out.println(al);
        al.add(0, "Hải");
        System.out.println(al);
        ArrayList al1 = new ArrayList();
        al1.add("Đức");
        al1.add("Vinh");
        System.out.println("al1" + al1);
        al.addAll(al1);
        System.out.println(al);
        al.addAll(0, al1);
        System.out.println(al);

//        Xóa tập hợp
//        al.clear();
//        System.out.println(al);

//Kiểm tra phần tử
        System.out.println(al.contains("Đức"));
//Lấy giá trị tajik vị trí truyền vào        
        System.out.println(al.get(3));
//lấy vị trị gặp đầu tiên         
        System.out.println(al.indexOf("Đạt"));
//Kiểm tra tập hợp rỗng        
        System.out.println(al.isEmpty());
// lấy vị trí từ phải sang       
        System.out.println(al.lastIndexOf("Đức"));
//xóa         
        al.remove("Đức");
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        al.set(0,"Bình");
        System.out.println(al);
        System.out.println(al.size());
        
    }
}
