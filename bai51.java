package offline.homework;

import java.util.Scanner;

public class bai51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x = 0;
        int max = 0;
        while (n > 0) {
            x = n % 10;
            if (x > max) {
                max = x;
            }
            n /= 10;
        }
        System.out.println("So lon nhat cua n la:  " + max);
    }
}
