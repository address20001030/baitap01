package offline.homework;

import java.util.Scanner;

public class bai56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int dem = 0;
        int x = 0;
        while (n > 0) {
            x = n % 10;
            if (x % 2 == 0) {
                dem++;
            }
            n /= 10;
        }
        if (dem == 0) {
            System.out.println("la so toan le");
        } else {
            System.out.println("khong phai la so toan le");
        }
    }
}
