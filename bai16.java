package offline.homework;

import java.util.Scanner;

// bai 17
public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so y: ");
        int y = sc.nextInt();
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        float s = 0;
        int x = 1;
        long t = 0;
        for (int i = 1; i < n + 1; i++) {
            t = (long) Math.pow(y, i);
            x *= i;
            s += t / (float) x;
        }
        System.out.println("Tong = " + s);
    }
}
