package offline.homework;

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int t = 1;
        int a = x;
        float s = 1 + x;
        for (int i = 3; i < (2 * n) + 2; i += 2) {
            a *= x * x;
            t *= i * (i - 1);
            s += a / (float) t;
        }
        System.out.println(s);
    }
}
