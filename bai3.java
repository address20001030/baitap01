package offline.homework;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float s = 1;
        for (int i = 2; i < n + 1; i++) {
            s += 1 / (float) i;
        }
        System.out.println("Tong thuong = " + s);
    }
}
