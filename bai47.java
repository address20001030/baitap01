package offline.homework;

import java.util.Scanner;

public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;
        int x = 0;
        while (n > 0) {
            x = n % 10;
            if (x % 2 == 0) {
                s += x;
            }
            n /= 10;
        }
        System.out.println("Tong cac chu so chan cua n = " + s);
    }
}
