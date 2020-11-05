package offline.homework;

import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        int x = sc.nextInt();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int t = 1;
        int a = 1;
        float s = 1;
        for (int i = 2; i <= n * 2; i += 2) {
            t *= (x * x);
            a *= i * (i - 1);
            s += t / (float) a;
        }
        System.out.println("S=" + s);
    }
}
