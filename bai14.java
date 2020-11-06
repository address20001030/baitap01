package offline.homework;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so x: ");
        long x = sc.nextLong();
        System.out.print("Nhap so mu: ");
        long n = sc.nextInt();
        long s = 0;
        for (int i = 0; i < n + 1; i++) {
            s += Math.pow(x, (2 * i) + 1);
        }
        System.out.println("Tong = " + s);
    }
}
