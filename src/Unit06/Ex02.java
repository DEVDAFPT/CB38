/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06;

/**
 *
 * @author Admin
 */
public class Ex02 {

    public static void main(String[] args) {
        String s = "Zent Coding School Z";
//TRả về kí tự ở vị trí truyền vàpo
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));

//Nối chuỗi
        System.out.println(s.concat(" !"));

//Kiểm tra chuỗi truyền vào có chứa trong chuỗi gốc
        System.out.println(s.contains("Z"));

//Kiểm tra chuỗi bằng 100%
        System.out.println(s.equals("zent coding School"));

//Kiểm tra chuỗi bằng không phân biệt chữ hoa
        System.out.println(s.equalsIgnoreCase("zent coding school"));

//kiểm tra chuỗi từ trái qua phải trả về giá trị
        System.out.println(s.indexOf("Z"));
        System.out.println(s.indexOf("Z", 5));

//kiểm tra chuỗi từ phải qua trái
        System.out.println(s.lastIndexOf("Z", 6));
        System.out.println(s.lastIndexOf("Z"));

//Kiểm tra chuỗi rỗng
        System.out.println(s.isEmpty());

//Độ dài chuỗi
        System.out.println(s.length());

//Thay thế
        System.out.println(s.replace("Z", "A"));
        String str = "    Nguyễn     Đức Ạnh    0866625423    Zent Coding";
        System.out.println(s.replaceAll("\\s+", " "));
        String info = "Nguyễn Đức Anh\t0866625423\tHà Nội";

//Cắt chuỗi theo định dạng nhất định
        String arr[] = info.split("\t");
        System.out.println("Họ tên:" + arr[0]);
        System.out.println("SĐT:" + arr[1]);
        System.out.println("Địa chỉ:" + arr[2]);

//Cắt chuỗi từ vị trí bắt đầu
        System.out.println(s.substring(6));

//cắt chuỗi từ 2 vị trí...
        System.out.println(s.subSequence(6, 9));

//Viết thường 
        System.out.println(s.toLowerCase());

//Viết hoa
        System.out.println(s.toUpperCase());

//Xóa khoản trắng đầu cuối
        System.out.println(s.trim());

    }
}
