package offline.homework;

import java.util.Scanner;

public class bai52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x = 0;
        int min = n;
        while (n > 0) {
            x = n % 10;
            if (x < min) {
                min = x;
            }
            n /= 10;
        }
        System.out.println("So nho nhat cua n la:  " + min);
    }
}
