package offline.homework;

import java.util.Scanner;

public class bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int temp = 0;
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                temp++;
            }
            if (temp != 0) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }


    }
}
