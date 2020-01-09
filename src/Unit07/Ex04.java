/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ex04 {

    public static void main(String[] args) throws IOException {
        try {
            try {
                Writer wr = null;
                // Ghi dữ liệu dạng text vào file
                wr = new FileWriter("product.txt");
                
                BufferedWriter bw = new BufferedWriter(wr);
                
                bw.write("Iphone 4\t20.000.000\tApple");  // Thông tin cách nhau bởi khoảng tab
                bw.newLine();  // Xuống dòng mới
                
                bw.write("Iphone 5\t20.000.000\tApple");
                bw.newLine();
                
                bw.write("Iphone 6\t20.000.000\tApple");
                
                bw.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(Ex04.class.getName()).log(Level.SEVERE, null, ex);
            }
            // đọc dữ liệu dạng text
            InputStream in = null;
            in = new FileInputStream("product.txt");
            
            Reader read = new InputStreamReader(in, "UTF-8");
            
            BufferedReader br = new BufferedReader(read);
            
            String s = br.readLine();
            int i=0;
            
            while (s != null){
                i++;
                System.out.println(i + ": "+s);
                s = br.readLine();
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex04.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
