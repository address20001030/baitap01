package offline.homework;

import java.util.Scanner;

public class bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        int x = (int) Math.sqrt(n);
        if (n == x * x) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai so chinh phuong");
        }
    }
}
