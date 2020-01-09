/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> arL = new ArrayList<>();

    public void menu() throws IOException {
        loadFlie();

        Scanner sc = new Scanner(System.in);
        int a;
        do {

            System.out.println("|------------------------------------------------------------------|");
            System.out.println("|(1)          Xem danh sách nhân viên                              |");
            System.out.println("|(2)          Thêm danh sách nhân viên                             |");
            System.out.println("|(3)         Xóa 1 nhân viên truyên vào mã nhân viên               |");
            System.out.println("|(4)   Chỉnh sửa 1 nhân viên truyền vào mã nhan viên               |");
            System.out.println("|(5)    Tìm kiếm 1 nhân viên viên truyền vào mã nhân viên/sdt/email|");
            System.out.println("|(6)                  Thoát                                        |");
            System.out.println("-------------------------------------------------------------------|");
            System.out.println("Nhập số bạn thích đi còn chờ gì nữa!");
            a = sc.nextInt();

            switch (a) {
                case 1: {
                    show();
                    saveFile();
                }

                break;
                case 2: {
                    add();
                    saveFile();
                }

                break;

                case 3: {
                    remove();
                    saveFile();
                }
                break;
                case 4: {
//                    change();
//                    saveFile();
                }
                break;
                case 5: {
                    search();
                    saveFile();
                }
                break;
                case 6: {
                    System.exit(a);
                }
                break;
            }
        } while (a != 1 || a != 2 || a != 3 || a != 4 || a != 5 || a != 6);

    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nhân viên muốn thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVien nv = new NhanVien();
            nv.nhapTT();
            System.out.println("Nhập nhân viên thứ " + i);
            arL.add(nv);

        }
    }

    public void show() {
        for (int i = 0; i < arL.size(); i++) {
            arL.get(i).inTT();
        }
    }


    public void remove() {
        System.out.println("Mời bạn nhập ID nhân viên muốn xóa: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < arL.size(); i++) {
            if (id.equalsIgnoreCase(arL.remove(i).getID())) {
                arL.get(i).inTT();
            }

        }
    }

    public void search() {
        System.out.println("Mời bạn nhập thông tin của nhân viên muốn tìm: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < arL.size(); i++) {
            if (id.equalsIgnoreCase(arL.get(i).getID())) {
                arL.get(i).inTT();
            }
        }

    }

    public void saveFile() throws IOException {
        Writer wr = new FileWriter("NhanVien.txt");
        BufferedWriter bw = new BufferedWriter(wr);
        String data = "";
        for (int i = 0; i < arL.size(); i++) {
            String row = "";
            row += arL.get(i).getID() + "\t";
            row += arL.get(i).getHoVaTen() + "\t";
            row += arL.get(i).getGioiTinh() + "\t";
            row += arL.get(i).getEmail() + "\t";
            row += arL.get(i).getNamSinh() + "\t";
            row += arL.get(i).getQueQuan() + "\t";
            row += arL.get(i).getSdt() + "\n";

            data += row;

        }
        bw.write(data);
        bw.close();
    }

    public void loadFlie() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        InputStream in = null;
        in = new FileInputStream("NhanVien.txt");

        Reader read = new InputStreamReader(in, "UTF-8");

        BufferedReader br = new BufferedReader(read);
        arL = new ArrayList<>();
        String data = "";
        while ((data = br.readLine()) != null) {

            String temp[] = data.split("\t");
            NhanVien nv = new NhanVien();
            if (temp.length == 1) {
                return;
            }

            nv.setID(temp[0]);
            nv.setHoVaTen(temp[1]);
            nv.setGioiTinh(temp[2]);
            nv.setEmail(temp[3]);
            nv.setNamSinh(temp[4]);
            nv.setQueQuan(temp[5]);
            nv.setSdt(temp[6]);

            arL.add(nv);

        }
        br.close();
    }

}
