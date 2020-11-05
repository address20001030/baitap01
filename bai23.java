package offline.homework;

import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int dem = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        System.out.println("So luong uoc cua n la: " + dem);
    }
}
