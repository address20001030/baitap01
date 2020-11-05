package offline.homework;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so x: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        int s = 0;
        int y = 1;
        for (int i = 1; i < n + 1; i++) {
            y *= x;
            s += y;
        }
        System.out.println("Tong = " + s);
    }
}
