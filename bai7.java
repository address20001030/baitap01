package offline.homework;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float s = 0;
        for (int i = 1; i < n + 1; i++) {
            s += (float) i / (i + 1);
        }
        System.out.println("Tong thuong = " + s);
    }
}
