package offline.homework;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float s = 0;
        for (int i = 0; i < n + 1; i++) {
            s += (float) ((2 * i) + 1) / ((2 * i) + 2);
        }
        System.out.println("Tong thuong = " + s);
    }
}
