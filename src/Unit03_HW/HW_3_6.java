    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Unit03_HW;

    import java.util.Scanner;

    /**
     *
     * @author Admin
     */
    public class HW_3_6 {

        public static void main(String[] args) {
//            XÓA CHỈ MỤC SỐ NGUYÊN K ĐƯỢC NHẬP TỪ BÀN PHÍM
            int n, i, gan;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Nhập vào số phần tử của mảng: ");
                n = scanner.nextInt();
            } while (n <= 0);

            int arr[] = new int[n];

            System.out.println("Nhập các phần tử cho mảng: ");
            for (i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.println("Nhập số nguyên k: ");
            int k = scanner.nextInt();
            for (gan = i = 0; i < n; i++) {
                if (arr[i] != k) {
                    arr[gan] = arr[i];
                    gan++;
                }
            }
            n = gan;
            System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
