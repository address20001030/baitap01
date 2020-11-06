package offline.homework;

import java.util.Scanner;

public class bai54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x = 0;
        int min = n;
        int dem = 0;
        while (n > 0) {
            x = n % 10;
            if (x < min) {
                min = x;
                dem++;
            }
            n /= 10;
        }
        System.out.println("So phan tu nho nhat cua n la:  " + dem);
    }
}
